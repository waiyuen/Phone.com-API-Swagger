=begin
#Phone.com API

#This is a Phone.com api Swagger definition

OpenAPI spec version: 1.0.0
Contact: apisupport@phone.com
Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::DeviceMembership
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'DeviceMembership' do
  before do
    # run before each test
    @instance = SwaggerClient::DeviceMembership.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of DeviceMembership' do
    it 'should create an instact of DeviceMembership' do
      expect(@instance).to be_instance_of(SwaggerClient::DeviceMembership)
    end
  end
  describe 'test attribute "line"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "device"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
