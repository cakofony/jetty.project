//
//  ========================================================================
//  Copyright (c) 1995-2017 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.server.session;

import org.junit.After;
import org.junit.Test;

/**
 * ImmortalSessionTest
 *
 *
 */

public class ImmortalSessionTest extends AbstractImmortalSessionTest
{
    public AbstractTestServer createServer(int port, int maxInactiveMs, int scavengeMs, int evictionPolicy) throws Exception
    {
        return new JdbcTestServer(port, maxInactiveMs, scavengeMs, evictionPolicy);
    }

    @Test
    public void testImmortalSession() throws Exception
    {
        super.testImmortalSession();
    }
    
    @After
    public void tearDown() throws Exception 
    {
        JdbcTestServer.shutdown(null);
    }
   
}
