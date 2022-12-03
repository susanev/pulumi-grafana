// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as grafana from "@lbrlabs/pulumi-grafana";
 *
 * const viewer = new grafana.BuiltinRoleAssignment("viewer", {
 *     builtinRole: "Viewer",
 *     roles: [
 *         {
 *             global: false,
 *             uid: "firstuid",
 *         },
 *         {
 *             global: true,
 *             uid: "seconduid",
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import grafana:index/builtinRoleAssignment:BuiltinRoleAssignment builtin_role_name {{builtin_role_name}}
 * ```
 */
export class BuiltinRoleAssignment extends pulumi.CustomResource {
    /**
     * Get an existing BuiltinRoleAssignment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BuiltinRoleAssignmentState, opts?: pulumi.CustomResourceOptions): BuiltinRoleAssignment {
        return new BuiltinRoleAssignment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'grafana:index/builtinRoleAssignment:BuiltinRoleAssignment';

    /**
     * Returns true if the given object is an instance of BuiltinRoleAssignment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BuiltinRoleAssignment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BuiltinRoleAssignment.__pulumiType;
    }

    /**
     * Organization roles (`Viewer`, `Editor`, `Admin`) or `Grafana Admin` to assign the roles to.
     */
    public readonly builtinRole!: pulumi.Output<string>;
    /**
     * Fixed or custom roles which provide granular access for specific resources within Grafana.
     */
    public readonly roles!: pulumi.Output<outputs.BuiltinRoleAssignmentRole[]>;

    /**
     * Create a BuiltinRoleAssignment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BuiltinRoleAssignmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BuiltinRoleAssignmentArgs | BuiltinRoleAssignmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BuiltinRoleAssignmentState | undefined;
            resourceInputs["builtinRole"] = state ? state.builtinRole : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
        } else {
            const args = argsOrState as BuiltinRoleAssignmentArgs | undefined;
            if ((!args || args.builtinRole === undefined) && !opts.urn) {
                throw new Error("Missing required property 'builtinRole'");
            }
            if ((!args || args.roles === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roles'");
            }
            resourceInputs["builtinRole"] = args ? args.builtinRole : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BuiltinRoleAssignment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BuiltinRoleAssignment resources.
 */
export interface BuiltinRoleAssignmentState {
    /**
     * Organization roles (`Viewer`, `Editor`, `Admin`) or `Grafana Admin` to assign the roles to.
     */
    builtinRole?: pulumi.Input<string>;
    /**
     * Fixed or custom roles which provide granular access for specific resources within Grafana.
     */
    roles?: pulumi.Input<pulumi.Input<inputs.BuiltinRoleAssignmentRole>[]>;
}

/**
 * The set of arguments for constructing a BuiltinRoleAssignment resource.
 */
export interface BuiltinRoleAssignmentArgs {
    /**
     * Organization roles (`Viewer`, `Editor`, `Admin`) or `Grafana Admin` to assign the roles to.
     */
    builtinRole: pulumi.Input<string>;
    /**
     * Fixed or custom roles which provide granular access for specific resources within Grafana.
     */
    roles: pulumi.Input<pulumi.Input<inputs.BuiltinRoleAssignmentRole>[]>;
}
