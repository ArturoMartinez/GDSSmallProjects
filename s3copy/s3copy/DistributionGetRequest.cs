/******************************************************************************* 
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  
 *  You may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at: http://www.apache.org/licenses/LICENSE-2.0.html 
 *  This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 *  CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 *  specific language governing permissions and limitations under the License.
 * ***************************************************************************** 
 * 
 *  Joel Wetzel
 *  Affirma Consulting
 *  jwetzel@affirmaconsulting.com
 * 
 */

using System;
using System.Xml.Serialization;
using System.Collections.Generic;
using System.Text;

namespace Affirma.ThreeSharp.Model
{
    /// <summary>
    /// The request object for a DistributionGet operation
    /// </summary>
    public class DistributionGetRequest : AWS100Request
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public DistributionGetRequest(string id)
        {
            this.Method = "GET";
            this.DistributionID = id;
        }
    }
}
