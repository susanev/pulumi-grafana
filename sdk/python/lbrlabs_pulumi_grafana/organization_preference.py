# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['OrganizationPreferenceArgs', 'OrganizationPreference']

@pulumi.input_type
class OrganizationPreferenceArgs:
    def __init__(__self__, *,
                 home_dashboard_id: Optional[pulumi.Input[int]] = None,
                 home_dashboard_uid: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 theme: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 week_start: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a OrganizationPreference resource.
        :param pulumi.Input[int] home_dashboard_id: The Organization home dashboard ID.
        :param pulumi.Input[str] home_dashboard_uid: The Organization home dashboard UID. This is only available in Grafana 9.0+.
        :param pulumi.Input[str] org_id: The Organization ID. If not set, the Org ID defined in the provider block will be used.
        :param pulumi.Input[str] theme: The Organization theme. Available values are `light`, `dark`, or an empty string for the default.
        :param pulumi.Input[str] timezone: The Organization timezone. Available values are `utc`, `browser`, or an empty string for the default.
        :param pulumi.Input[str] week_start: The Organization week start.
        """
        if home_dashboard_id is not None:
            pulumi.set(__self__, "home_dashboard_id", home_dashboard_id)
        if home_dashboard_uid is not None:
            pulumi.set(__self__, "home_dashboard_uid", home_dashboard_uid)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if theme is not None:
            pulumi.set(__self__, "theme", theme)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)
        if week_start is not None:
            pulumi.set(__self__, "week_start", week_start)

    @property
    @pulumi.getter(name="homeDashboardId")
    def home_dashboard_id(self) -> Optional[pulumi.Input[int]]:
        """
        The Organization home dashboard ID.
        """
        return pulumi.get(self, "home_dashboard_id")

    @home_dashboard_id.setter
    def home_dashboard_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "home_dashboard_id", value)

    @property
    @pulumi.getter(name="homeDashboardUid")
    def home_dashboard_uid(self) -> Optional[pulumi.Input[str]]:
        """
        The Organization home dashboard UID. This is only available in Grafana 9.0+.
        """
        return pulumi.get(self, "home_dashboard_uid")

    @home_dashboard_uid.setter
    def home_dashboard_uid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "home_dashboard_uid", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Organization ID. If not set, the Org ID defined in the provider block will be used.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def theme(self) -> Optional[pulumi.Input[str]]:
        """
        The Organization theme. Available values are `light`, `dark`, or an empty string for the default.
        """
        return pulumi.get(self, "theme")

    @theme.setter
    def theme(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "theme", value)

    @property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[str]]:
        """
        The Organization timezone. Available values are `utc`, `browser`, or an empty string for the default.
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timezone", value)

    @property
    @pulumi.getter(name="weekStart")
    def week_start(self) -> Optional[pulumi.Input[str]]:
        """
        The Organization week start.
        """
        return pulumi.get(self, "week_start")

    @week_start.setter
    def week_start(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "week_start", value)


@pulumi.input_type
class _OrganizationPreferenceState:
    def __init__(__self__, *,
                 home_dashboard_id: Optional[pulumi.Input[int]] = None,
                 home_dashboard_uid: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 theme: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 week_start: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OrganizationPreference resources.
        :param pulumi.Input[int] home_dashboard_id: The Organization home dashboard ID.
        :param pulumi.Input[str] home_dashboard_uid: The Organization home dashboard UID. This is only available in Grafana 9.0+.
        :param pulumi.Input[str] org_id: The Organization ID. If not set, the Org ID defined in the provider block will be used.
        :param pulumi.Input[str] theme: The Organization theme. Available values are `light`, `dark`, or an empty string for the default.
        :param pulumi.Input[str] timezone: The Organization timezone. Available values are `utc`, `browser`, or an empty string for the default.
        :param pulumi.Input[str] week_start: The Organization week start.
        """
        if home_dashboard_id is not None:
            pulumi.set(__self__, "home_dashboard_id", home_dashboard_id)
        if home_dashboard_uid is not None:
            pulumi.set(__self__, "home_dashboard_uid", home_dashboard_uid)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if theme is not None:
            pulumi.set(__self__, "theme", theme)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)
        if week_start is not None:
            pulumi.set(__self__, "week_start", week_start)

    @property
    @pulumi.getter(name="homeDashboardId")
    def home_dashboard_id(self) -> Optional[pulumi.Input[int]]:
        """
        The Organization home dashboard ID.
        """
        return pulumi.get(self, "home_dashboard_id")

    @home_dashboard_id.setter
    def home_dashboard_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "home_dashboard_id", value)

    @property
    @pulumi.getter(name="homeDashboardUid")
    def home_dashboard_uid(self) -> Optional[pulumi.Input[str]]:
        """
        The Organization home dashboard UID. This is only available in Grafana 9.0+.
        """
        return pulumi.get(self, "home_dashboard_uid")

    @home_dashboard_uid.setter
    def home_dashboard_uid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "home_dashboard_uid", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Organization ID. If not set, the Org ID defined in the provider block will be used.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def theme(self) -> Optional[pulumi.Input[str]]:
        """
        The Organization theme. Available values are `light`, `dark`, or an empty string for the default.
        """
        return pulumi.get(self, "theme")

    @theme.setter
    def theme(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "theme", value)

    @property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[str]]:
        """
        The Organization timezone. Available values are `utc`, `browser`, or an empty string for the default.
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timezone", value)

    @property
    @pulumi.getter(name="weekStart")
    def week_start(self) -> Optional[pulumi.Input[str]]:
        """
        The Organization week start.
        """
        return pulumi.get(self, "week_start")

    @week_start.setter
    def week_start(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "week_start", value)


class OrganizationPreference(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 home_dashboard_id: Optional[pulumi.Input[int]] = None,
                 home_dashboard_uid: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 theme: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 week_start: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        * [Official documentation](https://grafana.com/docs/grafana/latest/administration/organization-management/)
        * [HTTP API](https://grafana.com/docs/grafana/latest/developers/http_api/preferences/#get-current-org-prefs)

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_grafana as grafana

        test = grafana.OrganizationPreference("test",
            theme="light",
            timezone="utc",
            week_start="Tuesday")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] home_dashboard_id: The Organization home dashboard ID.
        :param pulumi.Input[str] home_dashboard_uid: The Organization home dashboard UID. This is only available in Grafana 9.0+.
        :param pulumi.Input[str] org_id: The Organization ID. If not set, the Org ID defined in the provider block will be used.
        :param pulumi.Input[str] theme: The Organization theme. Available values are `light`, `dark`, or an empty string for the default.
        :param pulumi.Input[str] timezone: The Organization timezone. Available values are `utc`, `browser`, or an empty string for the default.
        :param pulumi.Input[str] week_start: The Organization week start.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[OrganizationPreferenceArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        * [Official documentation](https://grafana.com/docs/grafana/latest/administration/organization-management/)
        * [HTTP API](https://grafana.com/docs/grafana/latest/developers/http_api/preferences/#get-current-org-prefs)

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_grafana as grafana

        test = grafana.OrganizationPreference("test",
            theme="light",
            timezone="utc",
            week_start="Tuesday")
        ```

        :param str resource_name: The name of the resource.
        :param OrganizationPreferenceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrganizationPreferenceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 home_dashboard_id: Optional[pulumi.Input[int]] = None,
                 home_dashboard_uid: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 theme: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 week_start: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrganizationPreferenceArgs.__new__(OrganizationPreferenceArgs)

            __props__.__dict__["home_dashboard_id"] = home_dashboard_id
            __props__.__dict__["home_dashboard_uid"] = home_dashboard_uid
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["theme"] = theme
            __props__.__dict__["timezone"] = timezone
            __props__.__dict__["week_start"] = week_start
        super(OrganizationPreference, __self__).__init__(
            'grafana:index/organizationPreference:OrganizationPreference',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            home_dashboard_id: Optional[pulumi.Input[int]] = None,
            home_dashboard_uid: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            theme: Optional[pulumi.Input[str]] = None,
            timezone: Optional[pulumi.Input[str]] = None,
            week_start: Optional[pulumi.Input[str]] = None) -> 'OrganizationPreference':
        """
        Get an existing OrganizationPreference resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] home_dashboard_id: The Organization home dashboard ID.
        :param pulumi.Input[str] home_dashboard_uid: The Organization home dashboard UID. This is only available in Grafana 9.0+.
        :param pulumi.Input[str] org_id: The Organization ID. If not set, the Org ID defined in the provider block will be used.
        :param pulumi.Input[str] theme: The Organization theme. Available values are `light`, `dark`, or an empty string for the default.
        :param pulumi.Input[str] timezone: The Organization timezone. Available values are `utc`, `browser`, or an empty string for the default.
        :param pulumi.Input[str] week_start: The Organization week start.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrganizationPreferenceState.__new__(_OrganizationPreferenceState)

        __props__.__dict__["home_dashboard_id"] = home_dashboard_id
        __props__.__dict__["home_dashboard_uid"] = home_dashboard_uid
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["theme"] = theme
        __props__.__dict__["timezone"] = timezone
        __props__.__dict__["week_start"] = week_start
        return OrganizationPreference(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="homeDashboardId")
    def home_dashboard_id(self) -> pulumi.Output[Optional[int]]:
        """
        The Organization home dashboard ID.
        """
        return pulumi.get(self, "home_dashboard_id")

    @property
    @pulumi.getter(name="homeDashboardUid")
    def home_dashboard_uid(self) -> pulumi.Output[Optional[str]]:
        """
        The Organization home dashboard UID. This is only available in Grafana 9.0+.
        """
        return pulumi.get(self, "home_dashboard_uid")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[Optional[str]]:
        """
        The Organization ID. If not set, the Org ID defined in the provider block will be used.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def theme(self) -> pulumi.Output[Optional[str]]:
        """
        The Organization theme. Available values are `light`, `dark`, or an empty string for the default.
        """
        return pulumi.get(self, "theme")

    @property
    @pulumi.getter
    def timezone(self) -> pulumi.Output[Optional[str]]:
        """
        The Organization timezone. Available values are `utc`, `browser`, or an empty string for the default.
        """
        return pulumi.get(self, "timezone")

    @property
    @pulumi.getter(name="weekStart")
    def week_start(self) -> pulumi.Output[Optional[str]]:
        """
        The Organization week start.
        """
        return pulumi.get(self, "week_start")

