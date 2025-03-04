// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package grafana

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// * [Official documentation](https://grafana.com/docs/grafana/latest/administration/roles-and-permissions/access-control/)
// * [HTTP API](https://grafana.com/docs/grafana/latest/developers/http_api/dashboard_permissions/)
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"os"
//
//	"github.com/lbrlabs/pulumi-grafana/sdk/go/grafana"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := os.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			team, err := grafana.NewTeam(ctx, "team", nil)
//			if err != nil {
//				return err
//			}
//			user, err := grafana.NewUser(ctx, "user", &grafana.UserArgs{
//				Email: pulumi.String("user.name@example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			metrics, err := grafana.NewDashboard(ctx, "metrics", &grafana.DashboardArgs{
//				ConfigJson: readFileOrPanic("grafana-dashboard.json"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = grafana.NewDashboardPermission(ctx, "collectionPermission", &grafana.DashboardPermissionArgs{
//				DashboardUid: metrics.Uid,
//				Permissions: grafana.DashboardPermissionPermissionArray{
//					&grafana.DashboardPermissionPermissionArgs{
//						Role:       pulumi.String("Editor"),
//						Permission: pulumi.String("Edit"),
//					},
//					&grafana.DashboardPermissionPermissionArgs{
//						TeamId:     team.ID(),
//						Permission: pulumi.String("View"),
//					},
//					&grafana.DashboardPermissionPermissionArgs{
//						UserId:     user.ID(),
//						Permission: pulumi.String("Admin"),
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
// ```sh
//
//	$ pulumi import grafana:index/dashboardPermission:DashboardPermission dashboard_name {{dashboard_uid}}
//
// ```
type DashboardPermission struct {
	pulumi.CustomResourceState

	// ID of the dashboard to apply permissions to. Deprecated: use `dashboardUid` instead.
	//
	// Deprecated: use `dashboard_uid` instead
	DashboardId pulumi.IntOutput `pulumi:"dashboardId"`
	// UID of the dashboard to apply permissions to.
	DashboardUid pulumi.StringOutput `pulumi:"dashboardUid"`
	// The permission items to add/update. Items that are omitted from the list will be removed.
	Permissions DashboardPermissionPermissionArrayOutput `pulumi:"permissions"`
}

// NewDashboardPermission registers a new resource with the given unique name, arguments, and options.
func NewDashboardPermission(ctx *pulumi.Context,
	name string, args *DashboardPermissionArgs, opts ...pulumi.ResourceOption) (*DashboardPermission, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Permissions == nil {
		return nil, errors.New("invalid value for required argument 'Permissions'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource DashboardPermission
	err := ctx.RegisterResource("grafana:index/dashboardPermission:DashboardPermission", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDashboardPermission gets an existing DashboardPermission resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDashboardPermission(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DashboardPermissionState, opts ...pulumi.ResourceOption) (*DashboardPermission, error) {
	var resource DashboardPermission
	err := ctx.ReadResource("grafana:index/dashboardPermission:DashboardPermission", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DashboardPermission resources.
type dashboardPermissionState struct {
	// ID of the dashboard to apply permissions to. Deprecated: use `dashboardUid` instead.
	//
	// Deprecated: use `dashboard_uid` instead
	DashboardId *int `pulumi:"dashboardId"`
	// UID of the dashboard to apply permissions to.
	DashboardUid *string `pulumi:"dashboardUid"`
	// The permission items to add/update. Items that are omitted from the list will be removed.
	Permissions []DashboardPermissionPermission `pulumi:"permissions"`
}

type DashboardPermissionState struct {
	// ID of the dashboard to apply permissions to. Deprecated: use `dashboardUid` instead.
	//
	// Deprecated: use `dashboard_uid` instead
	DashboardId pulumi.IntPtrInput
	// UID of the dashboard to apply permissions to.
	DashboardUid pulumi.StringPtrInput
	// The permission items to add/update. Items that are omitted from the list will be removed.
	Permissions DashboardPermissionPermissionArrayInput
}

func (DashboardPermissionState) ElementType() reflect.Type {
	return reflect.TypeOf((*dashboardPermissionState)(nil)).Elem()
}

type dashboardPermissionArgs struct {
	// ID of the dashboard to apply permissions to. Deprecated: use `dashboardUid` instead.
	//
	// Deprecated: use `dashboard_uid` instead
	DashboardId *int `pulumi:"dashboardId"`
	// UID of the dashboard to apply permissions to.
	DashboardUid *string `pulumi:"dashboardUid"`
	// The permission items to add/update. Items that are omitted from the list will be removed.
	Permissions []DashboardPermissionPermission `pulumi:"permissions"`
}

// The set of arguments for constructing a DashboardPermission resource.
type DashboardPermissionArgs struct {
	// ID of the dashboard to apply permissions to. Deprecated: use `dashboardUid` instead.
	//
	// Deprecated: use `dashboard_uid` instead
	DashboardId pulumi.IntPtrInput
	// UID of the dashboard to apply permissions to.
	DashboardUid pulumi.StringPtrInput
	// The permission items to add/update. Items that are omitted from the list will be removed.
	Permissions DashboardPermissionPermissionArrayInput
}

func (DashboardPermissionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dashboardPermissionArgs)(nil)).Elem()
}

type DashboardPermissionInput interface {
	pulumi.Input

	ToDashboardPermissionOutput() DashboardPermissionOutput
	ToDashboardPermissionOutputWithContext(ctx context.Context) DashboardPermissionOutput
}

func (*DashboardPermission) ElementType() reflect.Type {
	return reflect.TypeOf((**DashboardPermission)(nil)).Elem()
}

func (i *DashboardPermission) ToDashboardPermissionOutput() DashboardPermissionOutput {
	return i.ToDashboardPermissionOutputWithContext(context.Background())
}

func (i *DashboardPermission) ToDashboardPermissionOutputWithContext(ctx context.Context) DashboardPermissionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DashboardPermissionOutput)
}

// DashboardPermissionArrayInput is an input type that accepts DashboardPermissionArray and DashboardPermissionArrayOutput values.
// You can construct a concrete instance of `DashboardPermissionArrayInput` via:
//
//	DashboardPermissionArray{ DashboardPermissionArgs{...} }
type DashboardPermissionArrayInput interface {
	pulumi.Input

	ToDashboardPermissionArrayOutput() DashboardPermissionArrayOutput
	ToDashboardPermissionArrayOutputWithContext(context.Context) DashboardPermissionArrayOutput
}

type DashboardPermissionArray []DashboardPermissionInput

func (DashboardPermissionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DashboardPermission)(nil)).Elem()
}

func (i DashboardPermissionArray) ToDashboardPermissionArrayOutput() DashboardPermissionArrayOutput {
	return i.ToDashboardPermissionArrayOutputWithContext(context.Background())
}

func (i DashboardPermissionArray) ToDashboardPermissionArrayOutputWithContext(ctx context.Context) DashboardPermissionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DashboardPermissionArrayOutput)
}

// DashboardPermissionMapInput is an input type that accepts DashboardPermissionMap and DashboardPermissionMapOutput values.
// You can construct a concrete instance of `DashboardPermissionMapInput` via:
//
//	DashboardPermissionMap{ "key": DashboardPermissionArgs{...} }
type DashboardPermissionMapInput interface {
	pulumi.Input

	ToDashboardPermissionMapOutput() DashboardPermissionMapOutput
	ToDashboardPermissionMapOutputWithContext(context.Context) DashboardPermissionMapOutput
}

type DashboardPermissionMap map[string]DashboardPermissionInput

func (DashboardPermissionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DashboardPermission)(nil)).Elem()
}

func (i DashboardPermissionMap) ToDashboardPermissionMapOutput() DashboardPermissionMapOutput {
	return i.ToDashboardPermissionMapOutputWithContext(context.Background())
}

func (i DashboardPermissionMap) ToDashboardPermissionMapOutputWithContext(ctx context.Context) DashboardPermissionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DashboardPermissionMapOutput)
}

type DashboardPermissionOutput struct{ *pulumi.OutputState }

func (DashboardPermissionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DashboardPermission)(nil)).Elem()
}

func (o DashboardPermissionOutput) ToDashboardPermissionOutput() DashboardPermissionOutput {
	return o
}

func (o DashboardPermissionOutput) ToDashboardPermissionOutputWithContext(ctx context.Context) DashboardPermissionOutput {
	return o
}

// ID of the dashboard to apply permissions to. Deprecated: use `dashboardUid` instead.
//
// Deprecated: use `dashboard_uid` instead
func (o DashboardPermissionOutput) DashboardId() pulumi.IntOutput {
	return o.ApplyT(func(v *DashboardPermission) pulumi.IntOutput { return v.DashboardId }).(pulumi.IntOutput)
}

// UID of the dashboard to apply permissions to.
func (o DashboardPermissionOutput) DashboardUid() pulumi.StringOutput {
	return o.ApplyT(func(v *DashboardPermission) pulumi.StringOutput { return v.DashboardUid }).(pulumi.StringOutput)
}

// The permission items to add/update. Items that are omitted from the list will be removed.
func (o DashboardPermissionOutput) Permissions() DashboardPermissionPermissionArrayOutput {
	return o.ApplyT(func(v *DashboardPermission) DashboardPermissionPermissionArrayOutput { return v.Permissions }).(DashboardPermissionPermissionArrayOutput)
}

type DashboardPermissionArrayOutput struct{ *pulumi.OutputState }

func (DashboardPermissionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DashboardPermission)(nil)).Elem()
}

func (o DashboardPermissionArrayOutput) ToDashboardPermissionArrayOutput() DashboardPermissionArrayOutput {
	return o
}

func (o DashboardPermissionArrayOutput) ToDashboardPermissionArrayOutputWithContext(ctx context.Context) DashboardPermissionArrayOutput {
	return o
}

func (o DashboardPermissionArrayOutput) Index(i pulumi.IntInput) DashboardPermissionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DashboardPermission {
		return vs[0].([]*DashboardPermission)[vs[1].(int)]
	}).(DashboardPermissionOutput)
}

type DashboardPermissionMapOutput struct{ *pulumi.OutputState }

func (DashboardPermissionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DashboardPermission)(nil)).Elem()
}

func (o DashboardPermissionMapOutput) ToDashboardPermissionMapOutput() DashboardPermissionMapOutput {
	return o
}

func (o DashboardPermissionMapOutput) ToDashboardPermissionMapOutputWithContext(ctx context.Context) DashboardPermissionMapOutput {
	return o
}

func (o DashboardPermissionMapOutput) MapIndex(k pulumi.StringInput) DashboardPermissionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DashboardPermission {
		return vs[0].(map[string]*DashboardPermission)[vs[1].(string)]
	}).(DashboardPermissionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DashboardPermissionInput)(nil)).Elem(), &DashboardPermission{})
	pulumi.RegisterInputType(reflect.TypeOf((*DashboardPermissionArrayInput)(nil)).Elem(), DashboardPermissionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DashboardPermissionMapInput)(nil)).Elem(), DashboardPermissionMap{})
	pulumi.RegisterOutputType(DashboardPermissionOutput{})
	pulumi.RegisterOutputType(DashboardPermissionArrayOutput{})
	pulumi.RegisterOutputType(DashboardPermissionMapOutput{})
}
