=begin
#Phone.com API

#This is a Phone.com api Swagger definition

OpenAPI spec version: 1.0.0
Contact: apisupport@phone.com
Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::MediaApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'MediaApi' do
  before do
    # run before each test
    @instance = SwaggerClient::MediaApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of MediaApi' do
    it 'should create an instact of MediaApi' do
      expect(@instance).to be_instance_of(SwaggerClient::MediaApi)
    end
  end

  # unit tests for get_account_media
  # Show details of an individual media recording (Greeting or Hold Music)
  # Get individual media recording
  # @param account_id Account ID
  # @param recording_id Recording ID
  # @param [Hash] opts the optional parameters
  # @return [MediaFull]
  describe 'get_account_media test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_account_media
  # Get a list of media recordings for an account
  # See Account Menus for more info on the properties.
  # @param account_id Account ID
  # @param [Hash] opts the optional parameters
  # @option opts [Array<String>] :filters_id ID filter
  # @option opts [Array<String>] :filters_name Name filter
  # @option opts [String] :sort_id ID sorting
  # @option opts [String] :sort_name Name sorting
  # @option opts [Integer] :limit Max results
  # @option opts [Integer] :offset Results to skip
  # @option opts [String] :fields Field set
  # @return [ListMedia]
  describe 'list_account_media test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
