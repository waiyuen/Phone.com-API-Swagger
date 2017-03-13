# coding: utf-8

"""
    Phone.com API

    This is a Phone.com api Swagger definition

    OpenAPI spec version: 1.0.0
    Contact: apisupport@phone.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class CallNotifications(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, emails=None, sms=None):
        """
        CallNotifications - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'emails': 'list[str]',
            'sms': 'str'
        }

        self.attribute_map = {
            'emails': 'emails',
            'sms': 'sms'
        }

        self._emails = emails
        self._sms = sms

    @property
    def emails(self):
        """
        Gets the emails of this CallNotifications.
        Array of email addresses

        :return: The emails of this CallNotifications.
        :rtype: list[str]
        """
        return self._emails

    @emails.setter
    def emails(self, emails):
        """
        Sets the emails of this CallNotifications.
        Array of email addresses

        :param emails: The emails of this CallNotifications.
        :type: list[str]
        """

        self._emails = emails

    @property
    def sms(self):
        """
        Gets the sms of this CallNotifications.
        A phone number capable of receiving SMS messages

        :return: The sms of this CallNotifications.
        :rtype: str
        """
        return self._sms

    @sms.setter
    def sms(self, sms):
        """
        Sets the sms of this CallNotifications.
        A phone number capable of receiving SMS messages

        :param sms: The sms of this CallNotifications.
        :type: str
        """

        self._sms = sms

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        if not isinstance(other, CallNotifications):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other