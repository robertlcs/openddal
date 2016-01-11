/*
 * Copyright 2014-2016 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the “License”);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.openddal.command.ddl;

import com.openddal.command.CommandInterface;
import com.openddal.command.Prepared;
import com.openddal.command.expression.Parameter;
import com.openddal.engine.Session;
import com.openddal.message.DbException;
import com.openddal.util.New;

import java.util.ArrayList;

/**
 * This class represents the statement
 * PREPARE
 */
public class PrepareProcedure extends DefineCommand {

    private String procedureName;
    private Prepared prepared;

    public PrepareProcedure(Session session) {
        super(session);
    }

    @Override
    public void checkParameters() {
        // no not check parameters
    }

    @Override
    public int update() {
        throw DbException.getUnsupportedException("TODO");
    }

    @Override
    public ArrayList<Parameter> getParameters() {
        return New.arrayList();
    }

    @Override
    public int getType() {
        return CommandInterface.PREPARE;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String name) {
        this.procedureName = name;
    }

    public Prepared getPrepared() {
        return prepared;
    }

    public void setPrepared(Prepared prep) {
        this.prepared = prep;
    }

}