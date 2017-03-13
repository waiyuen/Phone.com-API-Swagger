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


class ListTrunks(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, filters=None, sort=None, total=None, offset=None, limit=None, items=None):
        """
        ListTrunks - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'filters': 'FilterIdNameArray',
            'sort': 'SortIdName',
            'total': 'int',
            'offset': 'int',
            'limit': 'int',
            'items': 'list[TrunkFull]'
        }

        self.attribute_map = {
            'filters': 'filters',
            'sort': 'sort',
            'total': 'total',
            'offset': 'offset',
            'limit': 'limit',
            'items': 'items'
        }

        self._filters = filters
        self._sort = sort
        self._total = total
        self._offset = offset
        self._limit = limit
        self._items = items

    @property
    def filters(self):
        """
        Gets the filters of this ListTrunks.

        :return: The filters of this ListTrunks.
        :rtype: FilterIdNameArray
        """
        return self._filters

    @filters.setter
    def filters(self, filters):
        """
        Sets the filters of this ListTrunks.

        :param filters: The filters of this ListTrunks.
        :type: FilterIdNameArray
        """

        self._filters = filters

    @property
    def sort(self):
        """
        Gets the sort of this ListTrunks.

        :return: The sort of this ListTrunks.
        :rtype: SortIdName
        """
        return self._sort

    @sort.setter
    def sort(self, sort):
        """
        Sets the sort of this ListTrunks.

        :param sort: The sort of this ListTrunks.
        :type: SortIdName
        """

        self._sort = sort

    @property
    def total(self):
        """
        Gets the total of this ListTrunks.

        :return: The total of this ListTrunks.
        :rtype: int
        """
        return self._total

    @total.setter
    def total(self, total):
        """
        Sets the total of this ListTrunks.

        :param total: The total of this ListTrunks.
        :type: int
        """

        self._total = total

    @property
    def offset(self):
        """
        Gets the offset of this ListTrunks.

        :return: The offset of this ListTrunks.
        :rtype: int
        """
        return self._offset

    @offset.setter
    def offset(self, offset):
        """
        Sets the offset of this ListTrunks.

        :param offset: The offset of this ListTrunks.
        :type: int
        """

        self._offset = offset

    @property
    def limit(self):
        """
        Gets the limit of this ListTrunks.

        :return: The limit of this ListTrunks.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """
        Sets the limit of this ListTrunks.

        :param limit: The limit of this ListTrunks.
        :type: int
        """

        self._limit = limit

    @property
    def items(self):
        """
        Gets the items of this ListTrunks.

        :return: The items of this ListTrunks.
        :rtype: list[TrunkFull]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this ListTrunks.

        :param items: The items of this ListTrunks.
        :type: list[TrunkFull]
        """

        self._items = items

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
        if not isinstance(other, ListTrunks):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
