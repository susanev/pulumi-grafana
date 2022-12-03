// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * * [Official documentation](https://grafana.com/docs/grafana/latest/administration/manage-organizations/)
 * * [HTTP API](https://grafana.com/docs/grafana/latest/http_api/org/)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as grafana from "@lbrlabs/pulumi-grafana";
 *
 * const test = new grafana.Organization("test", {
 *     adminUser: "admin",
 *     admins: ["admin@example.com"],
 *     createUsers: true,
 *     editors: [
 *         "editor-01@example.com",
 *         "editor-02@example.com",
 *     ],
 *     viewers: [
 *         "viewer-01@example.com",
 *         "viewer-02@example.com",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import grafana:index/organization:Organization org_name {{org_id}}
 * ```
 */
export class Organization extends pulumi.CustomResource {
    /**
     * Get an existing Organization resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationState, opts?: pulumi.CustomResourceOptions): Organization {
        return new Organization(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'grafana:index/organization:Organization';

    /**
     * Returns true if the given object is an instance of Organization.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Organization {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Organization.__pulumiType;
    }

    /**
     * The login name of the configured default admin user for the Grafana installation. If unset, this value defaults to
     * admin, the Grafana default. Grafana adds the default admin user to all organizations automatically upon creation, and
     * this parameter keeps Terraform from removing it from organizations.
     */
    public readonly adminUser!: pulumi.Output<string | undefined>;
    /**
     * A list of email addresses corresponding to users who should be given admin
     * access to the organization. Note: users specified here must already exist in
     * Grafana unless 'create_users' is set to true.
     */
    public readonly admins!: pulumi.Output<string[] | undefined>;
    /**
     * Whether or not to create Grafana users specified in the organization's
     * membership if they don't already exist in Grafana. If unspecified, this
     * parameter defaults to true, creating placeholder users with the name, login,
     * and email set to the email of the user, and a random password. Setting this
     * option to false will cause an error to be thrown for any users that do not
     * already exist in Grafana.
     * Defaults to `true`.
     */
    public readonly createUsers!: pulumi.Output<boolean | undefined>;
    /**
     * A list of email addresses corresponding to users who should be given editor
     * access to the organization. Note: users specified here must already exist in
     * Grafana unless 'create_users' is set to true.
     */
    public readonly editors!: pulumi.Output<string[] | undefined>;
    /**
     * The display name for the Grafana organization created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The organization id assigned to this organization by Grafana.
     */
    public /*out*/ readonly orgId!: pulumi.Output<number>;
    /**
     * A list of email addresses corresponding to users who should be given viewer
     * access to the organization. Note: users specified here must already exist in
     * Grafana unless 'create_users' is set to true.
     */
    public readonly viewers!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Organization resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: OrganizationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationArgs | OrganizationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationState | undefined;
            resourceInputs["adminUser"] = state ? state.adminUser : undefined;
            resourceInputs["admins"] = state ? state.admins : undefined;
            resourceInputs["createUsers"] = state ? state.createUsers : undefined;
            resourceInputs["editors"] = state ? state.editors : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["viewers"] = state ? state.viewers : undefined;
        } else {
            const args = argsOrState as OrganizationArgs | undefined;
            resourceInputs["adminUser"] = args ? args.adminUser : undefined;
            resourceInputs["admins"] = args ? args.admins : undefined;
            resourceInputs["createUsers"] = args ? args.createUsers : undefined;
            resourceInputs["editors"] = args ? args.editors : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["viewers"] = args ? args.viewers : undefined;
            resourceInputs["orgId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Organization.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Organization resources.
 */
export interface OrganizationState {
    /**
     * The login name of the configured default admin user for the Grafana installation. If unset, this value defaults to
     * admin, the Grafana default. Grafana adds the default admin user to all organizations automatically upon creation, and
     * this parameter keeps Terraform from removing it from organizations.
     */
    adminUser?: pulumi.Input<string>;
    /**
     * A list of email addresses corresponding to users who should be given admin
     * access to the organization. Note: users specified here must already exist in
     * Grafana unless 'create_users' is set to true.
     */
    admins?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether or not to create Grafana users specified in the organization's
     * membership if they don't already exist in Grafana. If unspecified, this
     * parameter defaults to true, creating placeholder users with the name, login,
     * and email set to the email of the user, and a random password. Setting this
     * option to false will cause an error to be thrown for any users that do not
     * already exist in Grafana.
     * Defaults to `true`.
     */
    createUsers?: pulumi.Input<boolean>;
    /**
     * A list of email addresses corresponding to users who should be given editor
     * access to the organization. Note: users specified here must already exist in
     * Grafana unless 'create_users' is set to true.
     */
    editors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The display name for the Grafana organization created.
     */
    name?: pulumi.Input<string>;
    /**
     * The organization id assigned to this organization by Grafana.
     */
    orgId?: pulumi.Input<number>;
    /**
     * A list of email addresses corresponding to users who should be given viewer
     * access to the organization. Note: users specified here must already exist in
     * Grafana unless 'create_users' is set to true.
     */
    viewers?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Organization resource.
 */
export interface OrganizationArgs {
    /**
     * The login name of the configured default admin user for the Grafana installation. If unset, this value defaults to
     * admin, the Grafana default. Grafana adds the default admin user to all organizations automatically upon creation, and
     * this parameter keeps Terraform from removing it from organizations.
     */
    adminUser?: pulumi.Input<string>;
    /**
     * A list of email addresses corresponding to users who should be given admin
     * access to the organization. Note: users specified here must already exist in
     * Grafana unless 'create_users' is set to true.
     */
    admins?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether or not to create Grafana users specified in the organization's
     * membership if they don't already exist in Grafana. If unspecified, this
     * parameter defaults to true, creating placeholder users with the name, login,
     * and email set to the email of the user, and a random password. Setting this
     * option to false will cause an error to be thrown for any users that do not
     * already exist in Grafana.
     * Defaults to `true`.
     */
    createUsers?: pulumi.Input<boolean>;
    /**
     * A list of email addresses corresponding to users who should be given editor
     * access to the organization. Note: users specified here must already exist in
     * Grafana unless 'create_users' is set to true.
     */
    editors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The display name for the Grafana organization created.
     */
    name?: pulumi.Input<string>;
    /**
     * A list of email addresses corresponding to users who should be given viewer
     * access to the organization. Note: users specified here must already exist in
     * Grafana unless 'create_users' is set to true.
     */
    viewers?: pulumi.Input<pulumi.Input<string>[]>;
}
