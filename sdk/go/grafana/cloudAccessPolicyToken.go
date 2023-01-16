// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package grafana

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// * [Official documentation](https://grafana.com/docs/grafana-cloud/authentication-and-permissions/access-policies/)
// * [API documentation](https://grafana.com/docs/grafana-cloud/reference/cloud-api/#create-a-token)
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
//			current, err := grafana.GetCloudOrganization(ctx, &grafana.GetCloudOrganizationArgs{
//				Slug: pulumi.StringRef("<your org slug>"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			testCloudAccessPolicy, err := grafana.NewCloudAccessPolicy(ctx, "testCloudAccessPolicy", &grafana.CloudAccessPolicyArgs{
//				Region:      pulumi.String("us"),
//				DisplayName: pulumi.String("My Policy"),
//				Scopes: pulumi.StringArray{
//					pulumi.String("metrics:read"),
//					pulumi.String("logs:read"),
//				},
//				Realms: grafana.CloudAccessPolicyRealmArray{
//					&grafana.CloudAccessPolicyRealmArgs{
//						Type:       pulumi.String("org"),
//						Identifier: *pulumi.String(current.Id),
//						LabelPolicies: grafana.CloudAccessPolicyRealmLabelPolicyArray{
//							&grafana.CloudAccessPolicyRealmLabelPolicyArgs{
//								Selector: pulumi.String("{namespace=\"default\"}"),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = grafana.NewCloudAccessPolicyToken(ctx, "testCloudAccessPolicyToken", &grafana.CloudAccessPolicyTokenArgs{
//				Region:         pulumi.String("us"),
//				AccessPolicyId: testCloudAccessPolicy.PolicyId,
//				DisplayName:    pulumi.String("My Policy Token"),
//				ExpiresAt:      pulumi.String("2023-01-01T00:00:00Z"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type CloudAccessPolicyToken struct {
	pulumi.CustomResourceState

	// ID of the access policy for which to create a token.
	AccessPolicyId pulumi.StringOutput `pulumi:"accessPolicyId"`
	// Creation date of the access policy token.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Display name of the access policy token. Defaults to the name.
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// Expiration date of the access policy token. Does not expire by default.
	ExpiresAt pulumi.StringPtrOutput `pulumi:"expiresAt"`
	// Name of the access policy token.
	Name pulumi.StringOutput `pulumi:"name"`
	// Region of the access policy. Should be set to the same region as the access policy.
	Region pulumi.StringOutput `pulumi:"region"`
	Token  pulumi.StringOutput `pulumi:"token"`
	// Last update date of the access policy token.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
}

// NewCloudAccessPolicyToken registers a new resource with the given unique name, arguments, and options.
func NewCloudAccessPolicyToken(ctx *pulumi.Context,
	name string, args *CloudAccessPolicyTokenArgs, opts ...pulumi.ResourceOption) (*CloudAccessPolicyToken, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessPolicyId == nil {
		return nil, errors.New("invalid value for required argument 'AccessPolicyId'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"token",
	})
	opts = append(opts, secrets)
	opts = pkgResourceDefaultOpts(opts)
	var resource CloudAccessPolicyToken
	err := ctx.RegisterResource("grafana:index/cloudAccessPolicyToken:CloudAccessPolicyToken", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudAccessPolicyToken gets an existing CloudAccessPolicyToken resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudAccessPolicyToken(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudAccessPolicyTokenState, opts ...pulumi.ResourceOption) (*CloudAccessPolicyToken, error) {
	var resource CloudAccessPolicyToken
	err := ctx.ReadResource("grafana:index/cloudAccessPolicyToken:CloudAccessPolicyToken", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudAccessPolicyToken resources.
type cloudAccessPolicyTokenState struct {
	// ID of the access policy for which to create a token.
	AccessPolicyId *string `pulumi:"accessPolicyId"`
	// Creation date of the access policy token.
	CreatedAt *string `pulumi:"createdAt"`
	// Display name of the access policy token. Defaults to the name.
	DisplayName *string `pulumi:"displayName"`
	// Expiration date of the access policy token. Does not expire by default.
	ExpiresAt *string `pulumi:"expiresAt"`
	// Name of the access policy token.
	Name *string `pulumi:"name"`
	// Region of the access policy. Should be set to the same region as the access policy.
	Region *string `pulumi:"region"`
	Token  *string `pulumi:"token"`
	// Last update date of the access policy token.
	UpdatedAt *string `pulumi:"updatedAt"`
}

type CloudAccessPolicyTokenState struct {
	// ID of the access policy for which to create a token.
	AccessPolicyId pulumi.StringPtrInput
	// Creation date of the access policy token.
	CreatedAt pulumi.StringPtrInput
	// Display name of the access policy token. Defaults to the name.
	DisplayName pulumi.StringPtrInput
	// Expiration date of the access policy token. Does not expire by default.
	ExpiresAt pulumi.StringPtrInput
	// Name of the access policy token.
	Name pulumi.StringPtrInput
	// Region of the access policy. Should be set to the same region as the access policy.
	Region pulumi.StringPtrInput
	Token  pulumi.StringPtrInput
	// Last update date of the access policy token.
	UpdatedAt pulumi.StringPtrInput
}

func (CloudAccessPolicyTokenState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudAccessPolicyTokenState)(nil)).Elem()
}

type cloudAccessPolicyTokenArgs struct {
	// ID of the access policy for which to create a token.
	AccessPolicyId string `pulumi:"accessPolicyId"`
	// Display name of the access policy token. Defaults to the name.
	DisplayName *string `pulumi:"displayName"`
	// Expiration date of the access policy token. Does not expire by default.
	ExpiresAt *string `pulumi:"expiresAt"`
	// Name of the access policy token.
	Name *string `pulumi:"name"`
	// Region of the access policy. Should be set to the same region as the access policy.
	Region string `pulumi:"region"`
}

// The set of arguments for constructing a CloudAccessPolicyToken resource.
type CloudAccessPolicyTokenArgs struct {
	// ID of the access policy for which to create a token.
	AccessPolicyId pulumi.StringInput
	// Display name of the access policy token. Defaults to the name.
	DisplayName pulumi.StringPtrInput
	// Expiration date of the access policy token. Does not expire by default.
	ExpiresAt pulumi.StringPtrInput
	// Name of the access policy token.
	Name pulumi.StringPtrInput
	// Region of the access policy. Should be set to the same region as the access policy.
	Region pulumi.StringInput
}

func (CloudAccessPolicyTokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudAccessPolicyTokenArgs)(nil)).Elem()
}

type CloudAccessPolicyTokenInput interface {
	pulumi.Input

	ToCloudAccessPolicyTokenOutput() CloudAccessPolicyTokenOutput
	ToCloudAccessPolicyTokenOutputWithContext(ctx context.Context) CloudAccessPolicyTokenOutput
}

func (*CloudAccessPolicyToken) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudAccessPolicyToken)(nil)).Elem()
}

func (i *CloudAccessPolicyToken) ToCloudAccessPolicyTokenOutput() CloudAccessPolicyTokenOutput {
	return i.ToCloudAccessPolicyTokenOutputWithContext(context.Background())
}

func (i *CloudAccessPolicyToken) ToCloudAccessPolicyTokenOutputWithContext(ctx context.Context) CloudAccessPolicyTokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudAccessPolicyTokenOutput)
}

// CloudAccessPolicyTokenArrayInput is an input type that accepts CloudAccessPolicyTokenArray and CloudAccessPolicyTokenArrayOutput values.
// You can construct a concrete instance of `CloudAccessPolicyTokenArrayInput` via:
//
//	CloudAccessPolicyTokenArray{ CloudAccessPolicyTokenArgs{...} }
type CloudAccessPolicyTokenArrayInput interface {
	pulumi.Input

	ToCloudAccessPolicyTokenArrayOutput() CloudAccessPolicyTokenArrayOutput
	ToCloudAccessPolicyTokenArrayOutputWithContext(context.Context) CloudAccessPolicyTokenArrayOutput
}

type CloudAccessPolicyTokenArray []CloudAccessPolicyTokenInput

func (CloudAccessPolicyTokenArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudAccessPolicyToken)(nil)).Elem()
}

func (i CloudAccessPolicyTokenArray) ToCloudAccessPolicyTokenArrayOutput() CloudAccessPolicyTokenArrayOutput {
	return i.ToCloudAccessPolicyTokenArrayOutputWithContext(context.Background())
}

func (i CloudAccessPolicyTokenArray) ToCloudAccessPolicyTokenArrayOutputWithContext(ctx context.Context) CloudAccessPolicyTokenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudAccessPolicyTokenArrayOutput)
}

// CloudAccessPolicyTokenMapInput is an input type that accepts CloudAccessPolicyTokenMap and CloudAccessPolicyTokenMapOutput values.
// You can construct a concrete instance of `CloudAccessPolicyTokenMapInput` via:
//
//	CloudAccessPolicyTokenMap{ "key": CloudAccessPolicyTokenArgs{...} }
type CloudAccessPolicyTokenMapInput interface {
	pulumi.Input

	ToCloudAccessPolicyTokenMapOutput() CloudAccessPolicyTokenMapOutput
	ToCloudAccessPolicyTokenMapOutputWithContext(context.Context) CloudAccessPolicyTokenMapOutput
}

type CloudAccessPolicyTokenMap map[string]CloudAccessPolicyTokenInput

func (CloudAccessPolicyTokenMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudAccessPolicyToken)(nil)).Elem()
}

func (i CloudAccessPolicyTokenMap) ToCloudAccessPolicyTokenMapOutput() CloudAccessPolicyTokenMapOutput {
	return i.ToCloudAccessPolicyTokenMapOutputWithContext(context.Background())
}

func (i CloudAccessPolicyTokenMap) ToCloudAccessPolicyTokenMapOutputWithContext(ctx context.Context) CloudAccessPolicyTokenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudAccessPolicyTokenMapOutput)
}

type CloudAccessPolicyTokenOutput struct{ *pulumi.OutputState }

func (CloudAccessPolicyTokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudAccessPolicyToken)(nil)).Elem()
}

func (o CloudAccessPolicyTokenOutput) ToCloudAccessPolicyTokenOutput() CloudAccessPolicyTokenOutput {
	return o
}

func (o CloudAccessPolicyTokenOutput) ToCloudAccessPolicyTokenOutputWithContext(ctx context.Context) CloudAccessPolicyTokenOutput {
	return o
}

// ID of the access policy for which to create a token.
func (o CloudAccessPolicyTokenOutput) AccessPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudAccessPolicyToken) pulumi.StringOutput { return v.AccessPolicyId }).(pulumi.StringOutput)
}

// Creation date of the access policy token.
func (o CloudAccessPolicyTokenOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudAccessPolicyToken) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Display name of the access policy token. Defaults to the name.
func (o CloudAccessPolicyTokenOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CloudAccessPolicyToken) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// Expiration date of the access policy token. Does not expire by default.
func (o CloudAccessPolicyTokenOutput) ExpiresAt() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CloudAccessPolicyToken) pulumi.StringPtrOutput { return v.ExpiresAt }).(pulumi.StringPtrOutput)
}

// Name of the access policy token.
func (o CloudAccessPolicyTokenOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudAccessPolicyToken) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Region of the access policy. Should be set to the same region as the access policy.
func (o CloudAccessPolicyTokenOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudAccessPolicyToken) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

func (o CloudAccessPolicyTokenOutput) Token() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudAccessPolicyToken) pulumi.StringOutput { return v.Token }).(pulumi.StringOutput)
}

// Last update date of the access policy token.
func (o CloudAccessPolicyTokenOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudAccessPolicyToken) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type CloudAccessPolicyTokenArrayOutput struct{ *pulumi.OutputState }

func (CloudAccessPolicyTokenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudAccessPolicyToken)(nil)).Elem()
}

func (o CloudAccessPolicyTokenArrayOutput) ToCloudAccessPolicyTokenArrayOutput() CloudAccessPolicyTokenArrayOutput {
	return o
}

func (o CloudAccessPolicyTokenArrayOutput) ToCloudAccessPolicyTokenArrayOutputWithContext(ctx context.Context) CloudAccessPolicyTokenArrayOutput {
	return o
}

func (o CloudAccessPolicyTokenArrayOutput) Index(i pulumi.IntInput) CloudAccessPolicyTokenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CloudAccessPolicyToken {
		return vs[0].([]*CloudAccessPolicyToken)[vs[1].(int)]
	}).(CloudAccessPolicyTokenOutput)
}

type CloudAccessPolicyTokenMapOutput struct{ *pulumi.OutputState }

func (CloudAccessPolicyTokenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudAccessPolicyToken)(nil)).Elem()
}

func (o CloudAccessPolicyTokenMapOutput) ToCloudAccessPolicyTokenMapOutput() CloudAccessPolicyTokenMapOutput {
	return o
}

func (o CloudAccessPolicyTokenMapOutput) ToCloudAccessPolicyTokenMapOutputWithContext(ctx context.Context) CloudAccessPolicyTokenMapOutput {
	return o
}

func (o CloudAccessPolicyTokenMapOutput) MapIndex(k pulumi.StringInput) CloudAccessPolicyTokenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CloudAccessPolicyToken {
		return vs[0].(map[string]*CloudAccessPolicyToken)[vs[1].(string)]
	}).(CloudAccessPolicyTokenOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CloudAccessPolicyTokenInput)(nil)).Elem(), &CloudAccessPolicyToken{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudAccessPolicyTokenArrayInput)(nil)).Elem(), CloudAccessPolicyTokenArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudAccessPolicyTokenMapInput)(nil)).Elem(), CloudAccessPolicyTokenMap{})
	pulumi.RegisterOutputType(CloudAccessPolicyTokenOutput{})
	pulumi.RegisterOutputType(CloudAccessPolicyTokenArrayOutput{})
	pulumi.RegisterOutputType(CloudAccessPolicyTokenMapOutput{})
}
