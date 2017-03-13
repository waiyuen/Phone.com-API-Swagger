=begin
#Phone.com API

#This is a Phone.com api Swagger definition

OpenAPI spec version: 1.0.0
Contact: apisupport@phone.com
Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require "uri"

module SwaggerClient
  class MediaApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # Show details of an individual media recording (Greeting or Hold Music)
    # Get individual media recording
    # @param account_id Account ID
    # @param recording_id Recording ID
    # @param [Hash] opts the optional parameters
    # @return [MediaFull]
    def get_account_media(account_id, recording_id, opts = {})
      data, _status_code, _headers = get_account_media_with_http_info(account_id, recording_id, opts)
      return data
    end

    # Show details of an individual media recording (Greeting or Hold Music)
    # Get individual media recording
    # @param account_id Account ID
    # @param recording_id Recording ID
    # @param [Hash] opts the optional parameters
    # @return [Array<(MediaFull, Fixnum, Hash)>] MediaFull data, response status code and response headers
    def get_account_media_with_http_info(account_id, recording_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: MediaApi.get_account_media ..."
      end
      # verify the required parameter 'account_id' is set
      fail ArgumentError, "Missing the required parameter 'account_id' when calling MediaApi.get_account_media" if account_id.nil?
      # verify the required parameter 'recording_id' is set
      fail ArgumentError, "Missing the required parameter 'recording_id' when calling MediaApi.get_account_media" if recording_id.nil?
      # resource path
      local_var_path = "/accounts/{account_id}/media/{recording_id}".sub('{format}','json').sub('{' + 'account_id' + '}', account_id.to_s).sub('{' + 'recording_id' + '}', recording_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['apiKey']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'MediaFull')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: MediaApi#get_account_media\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

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
    def list_account_media(account_id, opts = {})
      data, _status_code, _headers = list_account_media_with_http_info(account_id, opts)
      return data
    end

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
    # @return [Array<(ListMedia, Fixnum, Hash)>] ListMedia data, response status code and response headers
    def list_account_media_with_http_info(account_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: MediaApi.list_account_media ..."
      end
      # verify the required parameter 'account_id' is set
      fail ArgumentError, "Missing the required parameter 'account_id' when calling MediaApi.list_account_media" if account_id.nil?
      if !opts[:'sort_id'].nil? && opts[:'sort_id'] !~ Regexp.new(/asc|desc/)
        fail ArgumentError, "invalid value for 'opts[:\"sort_id\"]' when calling MediaApi.list_account_media, must conform to the pattern /asc|desc/."
      end

      if !opts[:'sort_name'].nil? && opts[:'sort_name'] !~ Regexp.new(/asc|desc/)
        fail ArgumentError, "invalid value for 'opts[:\"sort_name\"]' when calling MediaApi.list_account_media, must conform to the pattern /asc|desc/."
      end

      # resource path
      local_var_path = "/accounts/{account_id}/media".sub('{format}','json').sub('{' + 'account_id' + '}', account_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'filters[id]'] = @api_client.build_collection_param(opts[:'filters_id'], :multi) if !opts[:'filters_id'].nil?
      query_params[:'filters[name]'] = @api_client.build_collection_param(opts[:'filters_name'], :multi) if !opts[:'filters_name'].nil?
      query_params[:'sort[id]'] = opts[:'sort_id'] if !opts[:'sort_id'].nil?
      query_params[:'sort[name]'] = opts[:'sort_name'] if !opts[:'sort_name'].nil?
      query_params[:'limit'] = opts[:'limit'] if !opts[:'limit'].nil?
      query_params[:'offset'] = opts[:'offset'] if !opts[:'offset'].nil?
      query_params[:'fields'] = opts[:'fields'] if !opts[:'fields'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['apiKey']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'ListMedia')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: MediaApi#list_account_media\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
