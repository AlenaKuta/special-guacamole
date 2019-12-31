package com.learnreactivespring.fluxandmonoplayground;

import org.junit.jupiter.api.*;
import reactor.core.publisher.*;

public class FluxAndMonoTest {

    @Test
    public void fluxTest(){
        Flux<String> stringFlux = Flux.just("Spring", "SpringBoot", "Reactive Spring");

        stringFlux
                .subscribe(System.out::println,(e)->System.err.println(e));
    }

}
