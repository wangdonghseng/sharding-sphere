/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
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
 * </p>
 */

package io.shardingsphere.core;

import io.shardingsphere.core.api.AllApiTests;
import io.shardingsphere.core.constant.AllConstantsTests;
import io.shardingsphere.core.hint.AllHintTests;
import io.shardingsphere.core.merger.AllMergerTests;
import io.shardingsphere.core.optimizer.AllOptimizerTests;
import io.shardingsphere.core.parsing.AllParsingTests;
import io.shardingsphere.core.rewrite.AllRewriteTests;
import io.shardingsphere.core.routing.AllRoutingTests;
import io.shardingsphere.core.util.AllUtilTests;
import io.shardingsphere.core.yaml.AllYamlTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        AllConstantsTests.class, 
        AllApiTests.class, 
        AllUtilTests.class, 
        AllParsingTests.class,
        AllOptimizerTests.class, 
        AllRewriteTests.class, 
        AllRoutingTests.class, 
        AllMergerTests.class, 
        AllHintTests.class, 
        AllYamlTests.class
    })
public class AllTests {
}
