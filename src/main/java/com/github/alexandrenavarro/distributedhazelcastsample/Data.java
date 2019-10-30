package com.github.alexandrenavarro.distributedhazelcastsample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.print.attribute.IntegerSyntax;
import java.io.Serializable;
import java.util.concurrent.Callable;

@Builder
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data //implements Serializable
{
    private String id;
    private String label;

}
