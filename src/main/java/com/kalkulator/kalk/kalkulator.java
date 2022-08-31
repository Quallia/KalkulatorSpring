package com.kalkulator.kalk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kalkulator
{
    @GetMapping("/add/{x}/{y}")
    public Odpowiedź add(@PathVariable int x, @PathVariable int y)
    {
        return  new Odpowiedź(x, y, x+y);
    }
    @GetMapping("/sub/{x}/{y}")
    public Odpowiedź sub(@PathVariable int x, @PathVariable int y)
    {
        return  new Odpowiedź(x, y, x-y);
    }
    @GetMapping("/div/{x}/{y}")
    public Odpowiedź div(@PathVariable int x, @PathVariable int y)
    {
        return  new Odpowiedź(x, y, x/y);
    }
    @GetMapping("/mul/{x}/{y}")
    public Odpowiedź mul(@PathVariable int x, @PathVariable int y)
    {
        return  new Odpowiedź(x, y, x*y);
    }





}
