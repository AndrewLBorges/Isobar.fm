package com.isobar.project.dataSources;

import com.isobar.project.interfaces.DataSource;

public class ApiDataSource implements DataSource {
    private String data;

    public String getData() {
        return data;
    }
}