package com.jsu.entity;

import lombok.Data;

import java.util.List;

@Data
public class JoinQueryParam {
    private List<JoinTable> joinTables;
}
