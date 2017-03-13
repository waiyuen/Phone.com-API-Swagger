/* 
 * Phone.com API
 *
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing CalleridsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class CalleridsApiTests
    {
        private CalleridsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new CalleridsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of CalleridsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' CalleridsApi
            //Assert.IsInstanceOfType(typeof(CalleridsApi), instance, "instance is a CalleridsApi");
        }

        
        /// <summary>
        /// Test GetCallerIds
        /// </summary>
        [Test]
        public void GetCallerIdsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? accountId = null;
            //int? extensionId = null;
            //List<string> filtersNumber = null;
            //List<string> filtersName = null;
            //string sortNumber = null;
            //string sortName = null;
            //int? limit = null;
            //int? offset = null;
            //string fields = null;
            //var response = instance.GetCallerIds(accountId, extensionId, filtersNumber, filtersName, sortNumber, sortName, limit, offset, fields);
            //Assert.IsInstanceOf<ListCallerIds> (response, "response is ListCallerIds");
        }
        
    }

}