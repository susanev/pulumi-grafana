// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package grafana

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// * [Official documentation](https://grafana.com/docs/grafana/latest/administration/organization-management/)
// * [HTTP API](https://grafana.com/docs/grafana/latest/developers/http_api/org/)
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
//			test, err := grafana.NewOrganization(ctx, "test", &grafana.OrganizationArgs{
//				AdminUser:   pulumi.String("admin"),
//				CreateUsers: pulumi.Bool(true),
//				Viewers: pulumi.StringArray{
//					pulumi.String("viewer-01@example.com"),
//					pulumi.String("viewer-02@example.com"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_ = grafana.LookupOrganizationOutput(ctx, grafana.GetOrganizationOutputArgs{
//				Name: test.Name,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupOrganization(ctx *pulumi.Context, args *LookupOrganizationArgs, opts ...pulumi.InvokeOption) (*LookupOrganizationResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupOrganizationResult
	err := ctx.Invoke("grafana:index/getOrganization:getOrganization", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOrganization.
type LookupOrganizationArgs struct {
	// The name of the Organization.
	Name string `pulumi:"name"`
}

// A collection of values returned by getOrganization.
type LookupOrganizationResult struct {
	// A list of email addresses corresponding to users given admin access to the organization.
	Admins []string `pulumi:"admins"`
	// A list of email addresses corresponding to users given editor access to the organization.
	Editors []string `pulumi:"editors"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the Organization.
	Name string `pulumi:"name"`
	// A list of email addresses corresponding to users given viewer access to the organization.
	Viewers []string `pulumi:"viewers"`
}

func LookupOrganizationOutput(ctx *pulumi.Context, args LookupOrganizationOutputArgs, opts ...pulumi.InvokeOption) LookupOrganizationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupOrganizationResult, error) {
			args := v.(LookupOrganizationArgs)
			r, err := LookupOrganization(ctx, &args, opts...)
			var s LookupOrganizationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupOrganizationResultOutput)
}

// A collection of arguments for invoking getOrganization.
type LookupOrganizationOutputArgs struct {
	// The name of the Organization.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupOrganizationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrganizationArgs)(nil)).Elem()
}

// A collection of values returned by getOrganization.
type LookupOrganizationResultOutput struct{ *pulumi.OutputState }

func (LookupOrganizationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrganizationResult)(nil)).Elem()
}

func (o LookupOrganizationResultOutput) ToLookupOrganizationResultOutput() LookupOrganizationResultOutput {
	return o
}

func (o LookupOrganizationResultOutput) ToLookupOrganizationResultOutputWithContext(ctx context.Context) LookupOrganizationResultOutput {
	return o
}

// A list of email addresses corresponding to users given admin access to the organization.
func (o LookupOrganizationResultOutput) Admins() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupOrganizationResult) []string { return v.Admins }).(pulumi.StringArrayOutput)
}

// A list of email addresses corresponding to users given editor access to the organization.
func (o LookupOrganizationResultOutput) Editors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupOrganizationResult) []string { return v.Editors }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupOrganizationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the Organization.
func (o LookupOrganizationResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.Name }).(pulumi.StringOutput)
}

// A list of email addresses corresponding to users given viewer access to the organization.
func (o LookupOrganizationResultOutput) Viewers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupOrganizationResult) []string { return v.Viewers }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOrganizationResultOutput{})
}
