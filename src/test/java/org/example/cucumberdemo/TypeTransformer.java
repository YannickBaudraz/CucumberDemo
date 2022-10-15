package org.example.cucumberdemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.cucumber.java.ParameterType;

public class TypeTransformer {

    @ParameterType("(-?\\d+(,\\s*-?\\d+)*)")
    public List<Integer> listInt(String ints) {
        return Stream.of(ints.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
