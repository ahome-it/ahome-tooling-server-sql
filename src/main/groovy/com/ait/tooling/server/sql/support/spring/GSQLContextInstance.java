/*
 * Copyright (c) 2017 Ahome' Innovation Technologies. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ait.tooling.server.sql.support.spring;

import java.util.Objects;

import com.ait.tooling.server.core.support.spring.ServerContextInstance;

public class GSQLContextInstance extends ServerContextInstance implements IGSQLContext
{
    private static final GSQLContextInstance INSTANCE = new GSQLContextInstance();

    public static final GSQLContextInstance getGSQLContextInstance()
    {
        return INSTANCE;
    }

    protected GSQLContextInstance()
    {
    }

    @Override
    public final IGSQLProvider getGSQLProvider()
    {
        return Objects.requireNonNull(getBeanSafely("GSQLProvider", IGSQLProvider.class), "GSQLProvider is null, initialization error.");
    }
}
