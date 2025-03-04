// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package grafana

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Sets the global notification policy for Grafana.
//
// !> This resource manages the entire notification policy tree, and will overwrite any existing policies.
//
// * [Official documentation](https://grafana.com/docs/grafana/latest/alerting/manage-notifications/)
// * [HTTP API](https://grafana.com/docs/grafana/latest/developers/http_api/alerting_provisioning/)
//
// This resource requires Grafana 9.1.0 or later.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-grafana/sdk/go/grafana"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			aContactPoint, err := grafana.NewContactPoint(ctx, "aContactPoint", &grafana.ContactPointArgs{
//				Emails: grafana.ContactPointEmailArray{
//					&grafana.ContactPointEmailArgs{
//						Addresses: pulumi.StringArray{
//							pulumi.String("one@company.org"),
//							pulumi.String("two@company.org"),
//						},
//						Message: pulumi.String("{{ len .Alerts.Firing }} firing."),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			aMuteTiming, err := grafana.NewMuteTiming(ctx, "aMuteTiming", &grafana.MuteTimingArgs{
//				Intervals: grafana.MuteTimingIntervalArray{
//					&grafana.MuteTimingIntervalArgs{
//						Weekdays: pulumi.StringArray{
//							pulumi.String("monday"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = grafana.NewNotificationPolicy(ctx, "myNotificationPolicy", &grafana.NotificationPolicyArgs{
//				GroupBies: pulumi.StringArray{
//					pulumi.String("..."),
//				},
//				ContactPoint:   aContactPoint.Name,
//				GroupWait:      pulumi.String("45s"),
//				GroupInterval:  pulumi.String("6m"),
//				RepeatInterval: pulumi.String("3h"),
//				Policies: grafana.NotificationPolicyPolicyArray{
//					&grafana.NotificationPolicyPolicyArgs{
//						Matchers: grafana.NotificationPolicyPolicyMatcherArray{
//							&grafana.NotificationPolicyPolicyMatcherArgs{
//								Label: pulumi.String("mylabel"),
//								Match: pulumi.String("="),
//								Value: pulumi.String("myvalue"),
//							},
//						},
//						ContactPoint: aContactPoint.Name,
//						GroupBies: pulumi.StringArray{
//							pulumi.String("alertname"),
//						},
//						Continue: pulumi.Bool(true),
//						MuteTimings: pulumi.StringArray{
//							aMuteTiming.Name,
//						},
//						GroupWait:      pulumi.String("45s"),
//						GroupInterval:  pulumi.String("6m"),
//						RepeatInterval: pulumi.String("3h"),
//						Policies: grafana.NotificationPolicyPolicyPolicyArray{
//							&grafana.NotificationPolicyPolicyPolicyArgs{
//								Matchers: grafana.NotificationPolicyPolicyPolicyMatcherArray{
//									&grafana.NotificationPolicyPolicyPolicyMatcherArgs{
//										Label: pulumi.String("sublabel"),
//										Match: pulumi.String("="),
//										Value: pulumi.String("subvalue"),
//									},
//								},
//								ContactPoint: aContactPoint.Name,
//								GroupBies: pulumi.StringArray{
//									pulumi.String("..."),
//								},
//							},
//						},
//					},
//					&grafana.NotificationPolicyPolicyArgs{
//						Matchers: grafana.NotificationPolicyPolicyMatcherArray{
//							&grafana.NotificationPolicyPolicyMatcherArgs{
//								Label: pulumi.String("anotherlabel"),
//								Match: pulumi.String("=~"),
//								Value: pulumi.String("another value.*"),
//							},
//						},
//						ContactPoint: aContactPoint.Name,
//						GroupBies: pulumi.StringArray{
//							pulumi.String("..."),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// The policy is a singleton, so the ID is a constant "policy" value.
//
// ```sh
//
//	$ pulumi import grafana:index/notificationPolicy:NotificationPolicy notification_policy_name "policy"
//
// ```
type NotificationPolicy struct {
	pulumi.CustomResourceState

	// The default contact point to route all unmatched notifications to.
	ContactPoint pulumi.StringOutput `pulumi:"contactPoint"`
	// A list of alert labels to group alerts into notifications by. Use the special label `...` to group alerts by all labels, effectively disabling grouping.
	GroupBies pulumi.StringArrayOutput `pulumi:"groupBies"`
	// Minimum time interval between two notifications for the same group. Default is 5 minutes.
	GroupInterval pulumi.StringPtrOutput `pulumi:"groupInterval"`
	// Time to wait to buffer alerts of the same group before sending a notification. Default is 30 seconds.
	GroupWait pulumi.StringPtrOutput `pulumi:"groupWait"`
	// Routing rules for specific label sets.
	Policies NotificationPolicyPolicyArrayOutput `pulumi:"policies"`
	// Minimum time interval for re-sending a notification if an alert is still firing. Default is 4 hours.
	RepeatInterval pulumi.StringPtrOutput `pulumi:"repeatInterval"`
}

// NewNotificationPolicy registers a new resource with the given unique name, arguments, and options.
func NewNotificationPolicy(ctx *pulumi.Context,
	name string, args *NotificationPolicyArgs, opts ...pulumi.ResourceOption) (*NotificationPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContactPoint == nil {
		return nil, errors.New("invalid value for required argument 'ContactPoint'")
	}
	if args.GroupBies == nil {
		return nil, errors.New("invalid value for required argument 'GroupBies'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource NotificationPolicy
	err := ctx.RegisterResource("grafana:index/notificationPolicy:NotificationPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNotificationPolicy gets an existing NotificationPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNotificationPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NotificationPolicyState, opts ...pulumi.ResourceOption) (*NotificationPolicy, error) {
	var resource NotificationPolicy
	err := ctx.ReadResource("grafana:index/notificationPolicy:NotificationPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NotificationPolicy resources.
type notificationPolicyState struct {
	// The default contact point to route all unmatched notifications to.
	ContactPoint *string `pulumi:"contactPoint"`
	// A list of alert labels to group alerts into notifications by. Use the special label `...` to group alerts by all labels, effectively disabling grouping.
	GroupBies []string `pulumi:"groupBies"`
	// Minimum time interval between two notifications for the same group. Default is 5 minutes.
	GroupInterval *string `pulumi:"groupInterval"`
	// Time to wait to buffer alerts of the same group before sending a notification. Default is 30 seconds.
	GroupWait *string `pulumi:"groupWait"`
	// Routing rules for specific label sets.
	Policies []NotificationPolicyPolicy `pulumi:"policies"`
	// Minimum time interval for re-sending a notification if an alert is still firing. Default is 4 hours.
	RepeatInterval *string `pulumi:"repeatInterval"`
}

type NotificationPolicyState struct {
	// The default contact point to route all unmatched notifications to.
	ContactPoint pulumi.StringPtrInput
	// A list of alert labels to group alerts into notifications by. Use the special label `...` to group alerts by all labels, effectively disabling grouping.
	GroupBies pulumi.StringArrayInput
	// Minimum time interval between two notifications for the same group. Default is 5 minutes.
	GroupInterval pulumi.StringPtrInput
	// Time to wait to buffer alerts of the same group before sending a notification. Default is 30 seconds.
	GroupWait pulumi.StringPtrInput
	// Routing rules for specific label sets.
	Policies NotificationPolicyPolicyArrayInput
	// Minimum time interval for re-sending a notification if an alert is still firing. Default is 4 hours.
	RepeatInterval pulumi.StringPtrInput
}

func (NotificationPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationPolicyState)(nil)).Elem()
}

type notificationPolicyArgs struct {
	// The default contact point to route all unmatched notifications to.
	ContactPoint string `pulumi:"contactPoint"`
	// A list of alert labels to group alerts into notifications by. Use the special label `...` to group alerts by all labels, effectively disabling grouping.
	GroupBies []string `pulumi:"groupBies"`
	// Minimum time interval between two notifications for the same group. Default is 5 minutes.
	GroupInterval *string `pulumi:"groupInterval"`
	// Time to wait to buffer alerts of the same group before sending a notification. Default is 30 seconds.
	GroupWait *string `pulumi:"groupWait"`
	// Routing rules for specific label sets.
	Policies []NotificationPolicyPolicy `pulumi:"policies"`
	// Minimum time interval for re-sending a notification if an alert is still firing. Default is 4 hours.
	RepeatInterval *string `pulumi:"repeatInterval"`
}

// The set of arguments for constructing a NotificationPolicy resource.
type NotificationPolicyArgs struct {
	// The default contact point to route all unmatched notifications to.
	ContactPoint pulumi.StringInput
	// A list of alert labels to group alerts into notifications by. Use the special label `...` to group alerts by all labels, effectively disabling grouping.
	GroupBies pulumi.StringArrayInput
	// Minimum time interval between two notifications for the same group. Default is 5 minutes.
	GroupInterval pulumi.StringPtrInput
	// Time to wait to buffer alerts of the same group before sending a notification. Default is 30 seconds.
	GroupWait pulumi.StringPtrInput
	// Routing rules for specific label sets.
	Policies NotificationPolicyPolicyArrayInput
	// Minimum time interval for re-sending a notification if an alert is still firing. Default is 4 hours.
	RepeatInterval pulumi.StringPtrInput
}

func (NotificationPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationPolicyArgs)(nil)).Elem()
}

type NotificationPolicyInput interface {
	pulumi.Input

	ToNotificationPolicyOutput() NotificationPolicyOutput
	ToNotificationPolicyOutputWithContext(ctx context.Context) NotificationPolicyOutput
}

func (*NotificationPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationPolicy)(nil)).Elem()
}

func (i *NotificationPolicy) ToNotificationPolicyOutput() NotificationPolicyOutput {
	return i.ToNotificationPolicyOutputWithContext(context.Background())
}

func (i *NotificationPolicy) ToNotificationPolicyOutputWithContext(ctx context.Context) NotificationPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPolicyOutput)
}

// NotificationPolicyArrayInput is an input type that accepts NotificationPolicyArray and NotificationPolicyArrayOutput values.
// You can construct a concrete instance of `NotificationPolicyArrayInput` via:
//
//	NotificationPolicyArray{ NotificationPolicyArgs{...} }
type NotificationPolicyArrayInput interface {
	pulumi.Input

	ToNotificationPolicyArrayOutput() NotificationPolicyArrayOutput
	ToNotificationPolicyArrayOutputWithContext(context.Context) NotificationPolicyArrayOutput
}

type NotificationPolicyArray []NotificationPolicyInput

func (NotificationPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationPolicy)(nil)).Elem()
}

func (i NotificationPolicyArray) ToNotificationPolicyArrayOutput() NotificationPolicyArrayOutput {
	return i.ToNotificationPolicyArrayOutputWithContext(context.Background())
}

func (i NotificationPolicyArray) ToNotificationPolicyArrayOutputWithContext(ctx context.Context) NotificationPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPolicyArrayOutput)
}

// NotificationPolicyMapInput is an input type that accepts NotificationPolicyMap and NotificationPolicyMapOutput values.
// You can construct a concrete instance of `NotificationPolicyMapInput` via:
//
//	NotificationPolicyMap{ "key": NotificationPolicyArgs{...} }
type NotificationPolicyMapInput interface {
	pulumi.Input

	ToNotificationPolicyMapOutput() NotificationPolicyMapOutput
	ToNotificationPolicyMapOutputWithContext(context.Context) NotificationPolicyMapOutput
}

type NotificationPolicyMap map[string]NotificationPolicyInput

func (NotificationPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationPolicy)(nil)).Elem()
}

func (i NotificationPolicyMap) ToNotificationPolicyMapOutput() NotificationPolicyMapOutput {
	return i.ToNotificationPolicyMapOutputWithContext(context.Background())
}

func (i NotificationPolicyMap) ToNotificationPolicyMapOutputWithContext(ctx context.Context) NotificationPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPolicyMapOutput)
}

type NotificationPolicyOutput struct{ *pulumi.OutputState }

func (NotificationPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationPolicy)(nil)).Elem()
}

func (o NotificationPolicyOutput) ToNotificationPolicyOutput() NotificationPolicyOutput {
	return o
}

func (o NotificationPolicyOutput) ToNotificationPolicyOutputWithContext(ctx context.Context) NotificationPolicyOutput {
	return o
}

// The default contact point to route all unmatched notifications to.
func (o NotificationPolicyOutput) ContactPoint() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationPolicy) pulumi.StringOutput { return v.ContactPoint }).(pulumi.StringOutput)
}

// A list of alert labels to group alerts into notifications by. Use the special label `...` to group alerts by all labels, effectively disabling grouping.
func (o NotificationPolicyOutput) GroupBies() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NotificationPolicy) pulumi.StringArrayOutput { return v.GroupBies }).(pulumi.StringArrayOutput)
}

// Minimum time interval between two notifications for the same group. Default is 5 minutes.
func (o NotificationPolicyOutput) GroupInterval() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationPolicy) pulumi.StringPtrOutput { return v.GroupInterval }).(pulumi.StringPtrOutput)
}

// Time to wait to buffer alerts of the same group before sending a notification. Default is 30 seconds.
func (o NotificationPolicyOutput) GroupWait() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationPolicy) pulumi.StringPtrOutput { return v.GroupWait }).(pulumi.StringPtrOutput)
}

// Routing rules for specific label sets.
func (o NotificationPolicyOutput) Policies() NotificationPolicyPolicyArrayOutput {
	return o.ApplyT(func(v *NotificationPolicy) NotificationPolicyPolicyArrayOutput { return v.Policies }).(NotificationPolicyPolicyArrayOutput)
}

// Minimum time interval for re-sending a notification if an alert is still firing. Default is 4 hours.
func (o NotificationPolicyOutput) RepeatInterval() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationPolicy) pulumi.StringPtrOutput { return v.RepeatInterval }).(pulumi.StringPtrOutput)
}

type NotificationPolicyArrayOutput struct{ *pulumi.OutputState }

func (NotificationPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationPolicy)(nil)).Elem()
}

func (o NotificationPolicyArrayOutput) ToNotificationPolicyArrayOutput() NotificationPolicyArrayOutput {
	return o
}

func (o NotificationPolicyArrayOutput) ToNotificationPolicyArrayOutputWithContext(ctx context.Context) NotificationPolicyArrayOutput {
	return o
}

func (o NotificationPolicyArrayOutput) Index(i pulumi.IntInput) NotificationPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NotificationPolicy {
		return vs[0].([]*NotificationPolicy)[vs[1].(int)]
	}).(NotificationPolicyOutput)
}

type NotificationPolicyMapOutput struct{ *pulumi.OutputState }

func (NotificationPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationPolicy)(nil)).Elem()
}

func (o NotificationPolicyMapOutput) ToNotificationPolicyMapOutput() NotificationPolicyMapOutput {
	return o
}

func (o NotificationPolicyMapOutput) ToNotificationPolicyMapOutputWithContext(ctx context.Context) NotificationPolicyMapOutput {
	return o
}

func (o NotificationPolicyMapOutput) MapIndex(k pulumi.StringInput) NotificationPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NotificationPolicy {
		return vs[0].(map[string]*NotificationPolicy)[vs[1].(string)]
	}).(NotificationPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationPolicyInput)(nil)).Elem(), &NotificationPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationPolicyArrayInput)(nil)).Elem(), NotificationPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationPolicyMapInput)(nil)).Elem(), NotificationPolicyMap{})
	pulumi.RegisterOutputType(NotificationPolicyOutput{})
	pulumi.RegisterOutputType(NotificationPolicyArrayOutput{})
	pulumi.RegisterOutputType(NotificationPolicyMapOutput{})
}
