package org.zerock.exception;

import lombok.extern.log4j.Log4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Log4j
public class CommonExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public String except(Exception ex, Model model) {
        log.error("예외처리..." + ex.getMessage());
        model.addAttribute("ex", ex);
        return "errer";
    }
}
