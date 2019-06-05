package com.myk.learning.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Index api
 * <p/>
 * Created in 2018.12.04
 * <p/>
 *
 * @author myk
 */
@Controller
public class IndexApi {
    /**
     * Index string.
     *
     * @return the string
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
