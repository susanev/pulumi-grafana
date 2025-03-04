# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AlertNotificationArgs', 'AlertNotification']

@pulumi.input_type
class AlertNotificationArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str],
                 disable_resolve_message: Optional[pulumi.Input[bool]] = None,
                 frequency: Optional[pulumi.Input[str]] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secure_settings: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 send_reminder: Optional[pulumi.Input[bool]] = None,
                 settings: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 uid: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AlertNotification resource.
        :param pulumi.Input[str] type: The type of the alert notification channel.
        :param pulumi.Input[bool] disable_resolve_message: Whether to disable sending resolve messages. Defaults to `false`.
        :param pulumi.Input[str] frequency: Frequency of alert reminders. Frequency must be set if reminders are enabled. Defaults to ``.
        :param pulumi.Input[bool] is_default: Is this the default channel for all your alerts. Defaults to `false`.
        :param pulumi.Input[str] name: The name of the alert notification channel.
        :param pulumi.Input[Mapping[str, Any]] secure_settings: Additional secure settings, for full reference lookup [Grafana Supported Settings documentation](https://grafana.com/docs/grafana/latest/administration/provisioning/#supported-settings).
        :param pulumi.Input[bool] send_reminder: Whether to send reminders for triggered alerts. Defaults to `false`.
        :param pulumi.Input[Mapping[str, Any]] settings: Additional settings, for full reference see [Grafana HTTP API documentation](https://grafana.com/docs/grafana/latest/developers/http_api/alerting_notification_channels/).
        :param pulumi.Input[str] uid: Unique identifier. If unset, this will be automatically generated.
        """
        pulumi.set(__self__, "type", type)
        if disable_resolve_message is not None:
            pulumi.set(__self__, "disable_resolve_message", disable_resolve_message)
        if frequency is not None:
            pulumi.set(__self__, "frequency", frequency)
        if is_default is not None:
            pulumi.set(__self__, "is_default", is_default)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if secure_settings is not None:
            pulumi.set(__self__, "secure_settings", secure_settings)
        if send_reminder is not None:
            pulumi.set(__self__, "send_reminder", send_reminder)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)
        if uid is not None:
            pulumi.set(__self__, "uid", uid)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of the alert notification channel.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="disableResolveMessage")
    def disable_resolve_message(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to disable sending resolve messages. Defaults to `false`.
        """
        return pulumi.get(self, "disable_resolve_message")

    @disable_resolve_message.setter
    def disable_resolve_message(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_resolve_message", value)

    @property
    @pulumi.getter
    def frequency(self) -> Optional[pulumi.Input[str]]:
        """
        Frequency of alert reminders. Frequency must be set if reminders are enabled. Defaults to ``.
        """
        return pulumi.get(self, "frequency")

    @frequency.setter
    def frequency(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "frequency", value)

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> Optional[pulumi.Input[bool]]:
        """
        Is this the default channel for all your alerts. Defaults to `false`.
        """
        return pulumi.get(self, "is_default")

    @is_default.setter
    def is_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_default", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the alert notification channel.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="secureSettings")
    def secure_settings(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Additional secure settings, for full reference lookup [Grafana Supported Settings documentation](https://grafana.com/docs/grafana/latest/administration/provisioning/#supported-settings).
        """
        return pulumi.get(self, "secure_settings")

    @secure_settings.setter
    def secure_settings(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "secure_settings", value)

    @property
    @pulumi.getter(name="sendReminder")
    def send_reminder(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to send reminders for triggered alerts. Defaults to `false`.
        """
        return pulumi.get(self, "send_reminder")

    @send_reminder.setter
    def send_reminder(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "send_reminder", value)

    @property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Additional settings, for full reference see [Grafana HTTP API documentation](https://grafana.com/docs/grafana/latest/developers/http_api/alerting_notification_channels/).
        """
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "settings", value)

    @property
    @pulumi.getter
    def uid(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier. If unset, this will be automatically generated.
        """
        return pulumi.get(self, "uid")

    @uid.setter
    def uid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uid", value)


@pulumi.input_type
class _AlertNotificationState:
    def __init__(__self__, *,
                 disable_resolve_message: Optional[pulumi.Input[bool]] = None,
                 frequency: Optional[pulumi.Input[str]] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secure_settings: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 send_reminder: Optional[pulumi.Input[bool]] = None,
                 settings: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AlertNotification resources.
        :param pulumi.Input[bool] disable_resolve_message: Whether to disable sending resolve messages. Defaults to `false`.
        :param pulumi.Input[str] frequency: Frequency of alert reminders. Frequency must be set if reminders are enabled. Defaults to ``.
        :param pulumi.Input[bool] is_default: Is this the default channel for all your alerts. Defaults to `false`.
        :param pulumi.Input[str] name: The name of the alert notification channel.
        :param pulumi.Input[Mapping[str, Any]] secure_settings: Additional secure settings, for full reference lookup [Grafana Supported Settings documentation](https://grafana.com/docs/grafana/latest/administration/provisioning/#supported-settings).
        :param pulumi.Input[bool] send_reminder: Whether to send reminders for triggered alerts. Defaults to `false`.
        :param pulumi.Input[Mapping[str, Any]] settings: Additional settings, for full reference see [Grafana HTTP API documentation](https://grafana.com/docs/grafana/latest/developers/http_api/alerting_notification_channels/).
        :param pulumi.Input[str] type: The type of the alert notification channel.
        :param pulumi.Input[str] uid: Unique identifier. If unset, this will be automatically generated.
        """
        if disable_resolve_message is not None:
            pulumi.set(__self__, "disable_resolve_message", disable_resolve_message)
        if frequency is not None:
            pulumi.set(__self__, "frequency", frequency)
        if is_default is not None:
            pulumi.set(__self__, "is_default", is_default)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if secure_settings is not None:
            pulumi.set(__self__, "secure_settings", secure_settings)
        if send_reminder is not None:
            pulumi.set(__self__, "send_reminder", send_reminder)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if uid is not None:
            pulumi.set(__self__, "uid", uid)

    @property
    @pulumi.getter(name="disableResolveMessage")
    def disable_resolve_message(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to disable sending resolve messages. Defaults to `false`.
        """
        return pulumi.get(self, "disable_resolve_message")

    @disable_resolve_message.setter
    def disable_resolve_message(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_resolve_message", value)

    @property
    @pulumi.getter
    def frequency(self) -> Optional[pulumi.Input[str]]:
        """
        Frequency of alert reminders. Frequency must be set if reminders are enabled. Defaults to ``.
        """
        return pulumi.get(self, "frequency")

    @frequency.setter
    def frequency(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "frequency", value)

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> Optional[pulumi.Input[bool]]:
        """
        Is this the default channel for all your alerts. Defaults to `false`.
        """
        return pulumi.get(self, "is_default")

    @is_default.setter
    def is_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_default", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the alert notification channel.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="secureSettings")
    def secure_settings(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Additional secure settings, for full reference lookup [Grafana Supported Settings documentation](https://grafana.com/docs/grafana/latest/administration/provisioning/#supported-settings).
        """
        return pulumi.get(self, "secure_settings")

    @secure_settings.setter
    def secure_settings(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "secure_settings", value)

    @property
    @pulumi.getter(name="sendReminder")
    def send_reminder(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to send reminders for triggered alerts. Defaults to `false`.
        """
        return pulumi.get(self, "send_reminder")

    @send_reminder.setter
    def send_reminder(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "send_reminder", value)

    @property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Additional settings, for full reference see [Grafana HTTP API documentation](https://grafana.com/docs/grafana/latest/developers/http_api/alerting_notification_channels/).
        """
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "settings", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the alert notification channel.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def uid(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier. If unset, this will be automatically generated.
        """
        return pulumi.get(self, "uid")

    @uid.setter
    def uid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uid", value)


class AlertNotification(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 disable_resolve_message: Optional[pulumi.Input[bool]] = None,
                 frequency: Optional[pulumi.Input[str]] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secure_settings: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 send_reminder: Optional[pulumi.Input[bool]] = None,
                 settings: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uid: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_grafana as grafana

        email_someteam = grafana.AlertNotification("emailSometeam",
            frequency="24h",
            is_default=False,
            send_reminder=True,
            settings={
                "addresses": "foo@example.net;bar@example.net",
                "uploadImage": "false",
            },
            type="email")
        ```

        ## Import

        ```sh
         $ pulumi import grafana:index/alertNotification:AlertNotification alert_notification_name {{alert_notification_id}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] disable_resolve_message: Whether to disable sending resolve messages. Defaults to `false`.
        :param pulumi.Input[str] frequency: Frequency of alert reminders. Frequency must be set if reminders are enabled. Defaults to ``.
        :param pulumi.Input[bool] is_default: Is this the default channel for all your alerts. Defaults to `false`.
        :param pulumi.Input[str] name: The name of the alert notification channel.
        :param pulumi.Input[Mapping[str, Any]] secure_settings: Additional secure settings, for full reference lookup [Grafana Supported Settings documentation](https://grafana.com/docs/grafana/latest/administration/provisioning/#supported-settings).
        :param pulumi.Input[bool] send_reminder: Whether to send reminders for triggered alerts. Defaults to `false`.
        :param pulumi.Input[Mapping[str, Any]] settings: Additional settings, for full reference see [Grafana HTTP API documentation](https://grafana.com/docs/grafana/latest/developers/http_api/alerting_notification_channels/).
        :param pulumi.Input[str] type: The type of the alert notification channel.
        :param pulumi.Input[str] uid: Unique identifier. If unset, this will be automatically generated.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AlertNotificationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_grafana as grafana

        email_someteam = grafana.AlertNotification("emailSometeam",
            frequency="24h",
            is_default=False,
            send_reminder=True,
            settings={
                "addresses": "foo@example.net;bar@example.net",
                "uploadImage": "false",
            },
            type="email")
        ```

        ## Import

        ```sh
         $ pulumi import grafana:index/alertNotification:AlertNotification alert_notification_name {{alert_notification_id}}
        ```

        :param str resource_name: The name of the resource.
        :param AlertNotificationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AlertNotificationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 disable_resolve_message: Optional[pulumi.Input[bool]] = None,
                 frequency: Optional[pulumi.Input[str]] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secure_settings: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 send_reminder: Optional[pulumi.Input[bool]] = None,
                 settings: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uid: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AlertNotificationArgs.__new__(AlertNotificationArgs)

            __props__.__dict__["disable_resolve_message"] = disable_resolve_message
            __props__.__dict__["frequency"] = frequency
            __props__.__dict__["is_default"] = is_default
            __props__.__dict__["name"] = name
            __props__.__dict__["secure_settings"] = None if secure_settings is None else pulumi.Output.secret(secure_settings)
            __props__.__dict__["send_reminder"] = send_reminder
            __props__.__dict__["settings"] = settings
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["uid"] = uid
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["secureSettings"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(AlertNotification, __self__).__init__(
            'grafana:index/alertNotification:AlertNotification',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            disable_resolve_message: Optional[pulumi.Input[bool]] = None,
            frequency: Optional[pulumi.Input[str]] = None,
            is_default: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            secure_settings: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            send_reminder: Optional[pulumi.Input[bool]] = None,
            settings: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            uid: Optional[pulumi.Input[str]] = None) -> 'AlertNotification':
        """
        Get an existing AlertNotification resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] disable_resolve_message: Whether to disable sending resolve messages. Defaults to `false`.
        :param pulumi.Input[str] frequency: Frequency of alert reminders. Frequency must be set if reminders are enabled. Defaults to ``.
        :param pulumi.Input[bool] is_default: Is this the default channel for all your alerts. Defaults to `false`.
        :param pulumi.Input[str] name: The name of the alert notification channel.
        :param pulumi.Input[Mapping[str, Any]] secure_settings: Additional secure settings, for full reference lookup [Grafana Supported Settings documentation](https://grafana.com/docs/grafana/latest/administration/provisioning/#supported-settings).
        :param pulumi.Input[bool] send_reminder: Whether to send reminders for triggered alerts. Defaults to `false`.
        :param pulumi.Input[Mapping[str, Any]] settings: Additional settings, for full reference see [Grafana HTTP API documentation](https://grafana.com/docs/grafana/latest/developers/http_api/alerting_notification_channels/).
        :param pulumi.Input[str] type: The type of the alert notification channel.
        :param pulumi.Input[str] uid: Unique identifier. If unset, this will be automatically generated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AlertNotificationState.__new__(_AlertNotificationState)

        __props__.__dict__["disable_resolve_message"] = disable_resolve_message
        __props__.__dict__["frequency"] = frequency
        __props__.__dict__["is_default"] = is_default
        __props__.__dict__["name"] = name
        __props__.__dict__["secure_settings"] = secure_settings
        __props__.__dict__["send_reminder"] = send_reminder
        __props__.__dict__["settings"] = settings
        __props__.__dict__["type"] = type
        __props__.__dict__["uid"] = uid
        return AlertNotification(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="disableResolveMessage")
    def disable_resolve_message(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to disable sending resolve messages. Defaults to `false`.
        """
        return pulumi.get(self, "disable_resolve_message")

    @property
    @pulumi.getter
    def frequency(self) -> pulumi.Output[Optional[str]]:
        """
        Frequency of alert reminders. Frequency must be set if reminders are enabled. Defaults to ``.
        """
        return pulumi.get(self, "frequency")

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> pulumi.Output[Optional[bool]]:
        """
        Is this the default channel for all your alerts. Defaults to `false`.
        """
        return pulumi.get(self, "is_default")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the alert notification channel.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="secureSettings")
    def secure_settings(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        Additional secure settings, for full reference lookup [Grafana Supported Settings documentation](https://grafana.com/docs/grafana/latest/administration/provisioning/#supported-settings).
        """
        return pulumi.get(self, "secure_settings")

    @property
    @pulumi.getter(name="sendReminder")
    def send_reminder(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to send reminders for triggered alerts. Defaults to `false`.
        """
        return pulumi.get(self, "send_reminder")

    @property
    @pulumi.getter
    def settings(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        Additional settings, for full reference see [Grafana HTTP API documentation](https://grafana.com/docs/grafana/latest/developers/http_api/alerting_notification_channels/).
        """
        return pulumi.get(self, "settings")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of the alert notification channel.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def uid(self) -> pulumi.Output[str]:
        """
        Unique identifier. If unset, this will be automatically generated.
        """
        return pulumi.get(self, "uid")

