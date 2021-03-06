/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.smartag_inner.transform.v20180313;

import com.aliyuncs.smartag_inner.model.v20180313.InnerUpdateCCNEventFlowContextStepResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerUpdateCCNEventFlowContextStepResponseUnmarshaller {

	public static InnerUpdateCCNEventFlowContextStepResponse unmarshall(InnerUpdateCCNEventFlowContextStepResponse innerUpdateCCNEventFlowContextStepResponse, UnmarshallerContext context) {
		
		innerUpdateCCNEventFlowContextStepResponse.setRequestId(context.stringValue("InnerUpdateCCNEventFlowContextStepResponse.RequestId"));
	 
	 	return innerUpdateCCNEventFlowContextStepResponse;
	}
}