/*
 * Copyright (c) 2021 Goldman Sachs.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompany this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */

package org.eclipse.collections.test;

import org.junit.jupiter.api.Test;

public interface NoDetectOptionalNullTestCase extends RichIterableTestCase
{
    @Override
    @Test
    default void RichIterable_detectOptionalNull()
    {
        // Not applicable
    }
}
