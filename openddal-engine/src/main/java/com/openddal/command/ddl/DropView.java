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
import com.openddal.dbobject.schema.Schema;
import com.openddal.engine.Session;
import com.openddal.message.DbException;

/**
 * This class represents the statement
 * DROP VIEW
 */
public class DropView extends SchemaCommand {

    private String viewName;
    private boolean ifExists;
    private int dropAction;

    public DropView(Session session, Schema schema) {
        super(session, schema);
        dropAction = session.getDatabase().getSettings().dropRestrict ?
                AlterTableAddConstraint.RESTRICT :
                AlterTableAddConstraint.CASCADE;
    }

    @Override
    public int update() {
        throw DbException.getUnsupportedException("TODO");
    }

    @Override
    public int getType() {
        return CommandInterface.DROP_VIEW;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public boolean isIfExists() {
        return ifExists;
    }

    public void setIfExists(boolean b) {
        ifExists = b;
    }

    public int getDropAction() {
        return dropAction;
    }

    public void setDropAction(int dropAction) {
        this.dropAction = dropAction;
    }

}
