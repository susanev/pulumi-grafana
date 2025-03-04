// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package grafana

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			foo, err := grafana.NewApiKey(ctx, "foo", &grafana.ApiKeyArgs{
//				Role: pulumi.String("Viewer"),
//			})
//			if err != nil {
//				return err
//			}
//			bar, err := grafana.NewApiKey(ctx, "bar", &grafana.ApiKeyArgs{
//				Role:          pulumi.String("Admin"),
//				SecondsToLive: pulumi.Int(30),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("apiKeyFooKeyOnly", foo.Key)
//			ctx.Export("apiKeyBar", bar)
//			return nil
//		})
//	}
//
// ```
type ApiKey struct {
	pulumi.CustomResourceState

	// Deprecated: Use `CloudStackServiceAccount` and `CloudStackServiceAccountToken` resources instead
	//
	// Deprecated: Use `grafana_cloud_stack_service_account` and `grafana_cloud_stack_service_account_token` resources instead
	CloudStackSlug pulumi.StringPtrOutput `pulumi:"cloudStackSlug"`
	Expiration     pulumi.StringOutput    `pulumi:"expiration"`
	Key            pulumi.StringOutput    `pulumi:"key"`
	Name           pulumi.StringOutput    `pulumi:"name"`
	// The Organization ID. If not set, the Org ID defined in the provider block will be used.
	OrgId         pulumi.StringPtrOutput `pulumi:"orgId"`
	Role          pulumi.StringOutput    `pulumi:"role"`
	SecondsToLive pulumi.IntPtrOutput    `pulumi:"secondsToLive"`
}

// NewApiKey registers a new resource with the given unique name, arguments, and options.
func NewApiKey(ctx *pulumi.Context,
	name string, args *ApiKeyArgs, opts ...pulumi.ResourceOption) (*ApiKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"key",
	})
	opts = append(opts, secrets)
	opts = pkgResourceDefaultOpts(opts)
	var resource ApiKey
	err := ctx.RegisterResource("grafana:index/apiKey:ApiKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApiKey gets an existing ApiKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApiKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApiKeyState, opts ...pulumi.ResourceOption) (*ApiKey, error) {
	var resource ApiKey
	err := ctx.ReadResource("grafana:index/apiKey:ApiKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApiKey resources.
type apiKeyState struct {
	// Deprecated: Use `CloudStackServiceAccount` and `CloudStackServiceAccountToken` resources instead
	//
	// Deprecated: Use `grafana_cloud_stack_service_account` and `grafana_cloud_stack_service_account_token` resources instead
	CloudStackSlug *string `pulumi:"cloudStackSlug"`
	Expiration     *string `pulumi:"expiration"`
	Key            *string `pulumi:"key"`
	Name           *string `pulumi:"name"`
	// The Organization ID. If not set, the Org ID defined in the provider block will be used.
	OrgId         *string `pulumi:"orgId"`
	Role          *string `pulumi:"role"`
	SecondsToLive *int    `pulumi:"secondsToLive"`
}

type ApiKeyState struct {
	// Deprecated: Use `CloudStackServiceAccount` and `CloudStackServiceAccountToken` resources instead
	//
	// Deprecated: Use `grafana_cloud_stack_service_account` and `grafana_cloud_stack_service_account_token` resources instead
	CloudStackSlug pulumi.StringPtrInput
	Expiration     pulumi.StringPtrInput
	Key            pulumi.StringPtrInput
	Name           pulumi.StringPtrInput
	// The Organization ID. If not set, the Org ID defined in the provider block will be used.
	OrgId         pulumi.StringPtrInput
	Role          pulumi.StringPtrInput
	SecondsToLive pulumi.IntPtrInput
}

func (ApiKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*apiKeyState)(nil)).Elem()
}

type apiKeyArgs struct {
	// Deprecated: Use `CloudStackServiceAccount` and `CloudStackServiceAccountToken` resources instead
	//
	// Deprecated: Use `grafana_cloud_stack_service_account` and `grafana_cloud_stack_service_account_token` resources instead
	CloudStackSlug *string `pulumi:"cloudStackSlug"`
	Name           *string `pulumi:"name"`
	// The Organization ID. If not set, the Org ID defined in the provider block will be used.
	OrgId         *string `pulumi:"orgId"`
	Role          string  `pulumi:"role"`
	SecondsToLive *int    `pulumi:"secondsToLive"`
}

// The set of arguments for constructing a ApiKey resource.
type ApiKeyArgs struct {
	// Deprecated: Use `CloudStackServiceAccount` and `CloudStackServiceAccountToken` resources instead
	//
	// Deprecated: Use `grafana_cloud_stack_service_account` and `grafana_cloud_stack_service_account_token` resources instead
	CloudStackSlug pulumi.StringPtrInput
	Name           pulumi.StringPtrInput
	// The Organization ID. If not set, the Org ID defined in the provider block will be used.
	OrgId         pulumi.StringPtrInput
	Role          pulumi.StringInput
	SecondsToLive pulumi.IntPtrInput
}

func (ApiKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*apiKeyArgs)(nil)).Elem()
}

type ApiKeyInput interface {
	pulumi.Input

	ToApiKeyOutput() ApiKeyOutput
	ToApiKeyOutputWithContext(ctx context.Context) ApiKeyOutput
}

func (*ApiKey) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiKey)(nil)).Elem()
}

func (i *ApiKey) ToApiKeyOutput() ApiKeyOutput {
	return i.ToApiKeyOutputWithContext(context.Background())
}

func (i *ApiKey) ToApiKeyOutputWithContext(ctx context.Context) ApiKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiKeyOutput)
}

// ApiKeyArrayInput is an input type that accepts ApiKeyArray and ApiKeyArrayOutput values.
// You can construct a concrete instance of `ApiKeyArrayInput` via:
//
//	ApiKeyArray{ ApiKeyArgs{...} }
type ApiKeyArrayInput interface {
	pulumi.Input

	ToApiKeyArrayOutput() ApiKeyArrayOutput
	ToApiKeyArrayOutputWithContext(context.Context) ApiKeyArrayOutput
}

type ApiKeyArray []ApiKeyInput

func (ApiKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiKey)(nil)).Elem()
}

func (i ApiKeyArray) ToApiKeyArrayOutput() ApiKeyArrayOutput {
	return i.ToApiKeyArrayOutputWithContext(context.Background())
}

func (i ApiKeyArray) ToApiKeyArrayOutputWithContext(ctx context.Context) ApiKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiKeyArrayOutput)
}

// ApiKeyMapInput is an input type that accepts ApiKeyMap and ApiKeyMapOutput values.
// You can construct a concrete instance of `ApiKeyMapInput` via:
//
//	ApiKeyMap{ "key": ApiKeyArgs{...} }
type ApiKeyMapInput interface {
	pulumi.Input

	ToApiKeyMapOutput() ApiKeyMapOutput
	ToApiKeyMapOutputWithContext(context.Context) ApiKeyMapOutput
}

type ApiKeyMap map[string]ApiKeyInput

func (ApiKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiKey)(nil)).Elem()
}

func (i ApiKeyMap) ToApiKeyMapOutput() ApiKeyMapOutput {
	return i.ToApiKeyMapOutputWithContext(context.Background())
}

func (i ApiKeyMap) ToApiKeyMapOutputWithContext(ctx context.Context) ApiKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiKeyMapOutput)
}

type ApiKeyOutput struct{ *pulumi.OutputState }

func (ApiKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiKey)(nil)).Elem()
}

func (o ApiKeyOutput) ToApiKeyOutput() ApiKeyOutput {
	return o
}

func (o ApiKeyOutput) ToApiKeyOutputWithContext(ctx context.Context) ApiKeyOutput {
	return o
}

// Deprecated: Use `CloudStackServiceAccount` and `CloudStackServiceAccountToken` resources instead
//
// Deprecated: Use `grafana_cloud_stack_service_account` and `grafana_cloud_stack_service_account_token` resources instead
func (o ApiKeyOutput) CloudStackSlug() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringPtrOutput { return v.CloudStackSlug }).(pulumi.StringPtrOutput)
}

func (o ApiKeyOutput) Expiration() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringOutput { return v.Expiration }).(pulumi.StringOutput)
}

func (o ApiKeyOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

func (o ApiKeyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The Organization ID. If not set, the Org ID defined in the provider block will be used.
func (o ApiKeyOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

func (o ApiKeyOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

func (o ApiKeyOutput) SecondsToLive() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.IntPtrOutput { return v.SecondsToLive }).(pulumi.IntPtrOutput)
}

type ApiKeyArrayOutput struct{ *pulumi.OutputState }

func (ApiKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiKey)(nil)).Elem()
}

func (o ApiKeyArrayOutput) ToApiKeyArrayOutput() ApiKeyArrayOutput {
	return o
}

func (o ApiKeyArrayOutput) ToApiKeyArrayOutputWithContext(ctx context.Context) ApiKeyArrayOutput {
	return o
}

func (o ApiKeyArrayOutput) Index(i pulumi.IntInput) ApiKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApiKey {
		return vs[0].([]*ApiKey)[vs[1].(int)]
	}).(ApiKeyOutput)
}

type ApiKeyMapOutput struct{ *pulumi.OutputState }

func (ApiKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiKey)(nil)).Elem()
}

func (o ApiKeyMapOutput) ToApiKeyMapOutput() ApiKeyMapOutput {
	return o
}

func (o ApiKeyMapOutput) ToApiKeyMapOutputWithContext(ctx context.Context) ApiKeyMapOutput {
	return o
}

func (o ApiKeyMapOutput) MapIndex(k pulumi.StringInput) ApiKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApiKey {
		return vs[0].(map[string]*ApiKey)[vs[1].(string)]
	}).(ApiKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApiKeyInput)(nil)).Elem(), &ApiKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiKeyArrayInput)(nil)).Elem(), ApiKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiKeyMapInput)(nil)).Elem(), ApiKeyMap{})
	pulumi.RegisterOutputType(ApiKeyOutput{})
	pulumi.RegisterOutputType(ApiKeyArrayOutput{})
	pulumi.RegisterOutputType(ApiKeyMapOutput{})
}
