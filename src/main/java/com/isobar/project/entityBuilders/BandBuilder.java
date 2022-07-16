package com.isobar.project.entityBuilders;

import com.isobar.project.interfaces.*;
import com.isobar.project.entities.*;

public class BandBuilder implements EntityBuilder<Band>{
    private DataSource dataSource;

    public BandBuilder(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public Band getEntity(){
        String data = dataSource.getData();


    }
}