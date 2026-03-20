/*
 * Copyright (c) 2026 PANTHEON.tech s.r.o. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.yangtools.yang.stmt;

import org.junit.jupiter.api.Test;

class YT1823Test extends AbstractYangTest {
    @Test
    void testBadBoolean() {
        assertSourceExceptionMessage("/bugs/YT1823/foo.yang")
            .startsWith("Invalid mandatory statement value 'TRUE', it can be either 'true' or 'false' [at")
            .endsWith("/foo.yang:7:5]");
    }
}
