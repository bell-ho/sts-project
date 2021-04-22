package org.zerock.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

@Controller
@Log4j
@RequestMapping("/board/*")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/boardList")
    public String list(Model model) {
        log.info("게시판 리스트");
        model.addAttribute("list", boardService.getList());
        return "/board/list";
    }

    @GetMapping("/boardInser")
    public String register() {
        return "";
    }

    @PostMapping("/boardInsert")
    public String register(BoardVO boardVO, RedirectAttributes rttr) {
        boardService.insertKey(boardVO);
        return "redirect:/board/list";
    }

    @GetMapping("/boardRead")
    public String get(BoardVO boardVO, Model model) {
        model.addAttribute("board", boardService.read(boardVO));
        return "/board/read";
    }

    @PostMapping("/boardUpdate")
    public String update(BoardVO boardVO, RedirectAttributes rttr) {
        boardService.update(boardVO);
        return "redirect:/board/list";
    }

    @PostMapping("/boardDelete")
    public String delete(BoardVO boardVO) {
        boardService.delete(boardVO);
        return "redirect:/board/list";
    }
}
