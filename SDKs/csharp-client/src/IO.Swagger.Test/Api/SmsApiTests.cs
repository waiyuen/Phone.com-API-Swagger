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
    ///  Class for testing SmsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class SmsApiTests
    {
        private SmsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new SmsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of SmsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' SmsApi
            //Assert.IsInstanceOfType(typeof(SmsApi), instance, "instance is a SmsApi");
        }

        
        /// <summary>
        /// Test CreateAccountSms
        /// </summary>
        [Test]
        public void CreateAccountSmsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? accountId = null;
            //CreateSmsParams data = null;
            //var response = instance.CreateAccountSms(accountId, data);
            //Assert.IsInstanceOf<SmsFull> (response, "response is SmsFull");
        }
        
        /// <summary>
        /// Test GetAccountSms
        /// </summary>
        [Test]
        public void GetAccountSmsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? accountId = null;
            //string smsId = null;
            //var response = instance.GetAccountSms(accountId, smsId);
            //Assert.IsInstanceOf<SmsFull> (response, "response is SmsFull");
        }
        
        /// <summary>
        /// Test ListAccountSms
        /// </summary>
        [Test]
        public void ListAccountSmsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? accountId = null;
            //List<string> filtersId = null;
            //string filtersDirection = null;
            //string filtersFrom = null;
            //string sortId = null;
            //string sortCreatedAt = null;
            //int? limit = null;
            //int? offset = null;
            //string fields = null;
            //var response = instance.ListAccountSms(accountId, filtersId, filtersDirection, filtersFrom, sortId, sortCreatedAt, limit, offset, fields);
            //Assert.IsInstanceOf<ListSms> (response, "response is ListSms");
        }
        
    }

}
