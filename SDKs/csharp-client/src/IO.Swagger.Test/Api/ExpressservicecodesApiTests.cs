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
    ///  Class for testing ExpressservicecodesApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class ExpressservicecodesApiTests
    {
        private ExpressservicecodesApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new ExpressservicecodesApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ExpressservicecodesApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' ExpressservicecodesApi
            //Assert.IsInstanceOfType(typeof(ExpressservicecodesApi), instance, "instance is a ExpressservicecodesApi");
        }

        
        /// <summary>
        /// Test GetAccountExpressSrvCode
        /// </summary>
        [Test]
        public void GetAccountExpressSrvCodeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? accountId = null;
            //int? codeId = null;
            //var response = instance.GetAccountExpressSrvCode(accountId, codeId);
            //Assert.IsInstanceOf<ExpressServiceCodeFull> (response, "response is ExpressServiceCodeFull");
        }
        
        /// <summary>
        /// Test ListAccountExpressSrvCodes
        /// </summary>
        [Test]
        public void ListAccountExpressSrvCodesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? accountId = null;
            //List<string> filtersId = null;
            //var response = instance.ListAccountExpressSrvCodes(accountId, filtersId);
            //Assert.IsInstanceOf<ListExpressServiceCodes> (response, "response is ListExpressServiceCodes");
        }
        
    }

}
