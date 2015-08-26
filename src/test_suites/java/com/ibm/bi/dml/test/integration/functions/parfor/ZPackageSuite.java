/**
 * (C) Copyright IBM Corp. 2010, 2015
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
 * 
 */

package com.ibm.bi.dml.test.integration.functions.parfor;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/** Group together the tests in this package into a single suite so that the Maven build
 *  won't run two of them at once. */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	ForLoopPredicateTest.class,
	ParForAdversarialLiteralsTest.class,
	ParForColwiseDataPartitioningTest.class,
	ParForDataPartitionLeftIndexingTest.class,
	ParForDependencyAnalysisTest.class,
	ParForFunctionSerializationTest.class,
	ParForMultipleDataPartitioningTest.class,
	ParForNaNResultMergeTest.class,
	ParForReplaceThreadIDRecompileTest.class,
	ParForRowwiseDataPartitioningTest.class,
	
	ParForParallelRemoteResultMergeTest.class,
	ParForSerialRemoteResultMergeTest.class,
	ParForRepeatedOptimizationTest.class,
	ParForRulebasedOptimizerTest.class
})


/** This class is just a holder for the above JUnit annotations. */
public class ZPackageSuite {

}
