// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * * [Official documentation](https://grafana.com/docs/grafana/latest/administration/manage-users-and-permissions/manage-teams/)
 * * [HTTP API](https://grafana.com/docs/grafana/latest/http_api/team/)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as grafana from "@lbrlabs/pulumi-grafana";
 *
 * const test_team = new grafana.Team("test-team", {
 *     email: "teamemail@example.com",
 *     members: ["viewer-01@example.com"],
 * });
 * ```
 */
export class Team extends pulumi.CustomResource {
    /**
     * Get an existing Team resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TeamState, opts?: pulumi.CustomResourceOptions): Team {
        return new Team(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'grafana:index/team:Team';

    /**
     * Returns true if the given object is an instance of Team.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Team {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Team.__pulumiType;
    }

    /**
     * An email address for the team.
     */
    public readonly email!: pulumi.Output<string | undefined>;
    /**
     * Ignores team members that have been added to team by [Team
     * Sync](https://grafana.com/docs/grafana/latest/enterprise/team-sync/). Team Sync can be provisioned using
     * [grafana_team_external_group
     * resource](https://registry.terraform.io/providers/grafana/grafana/latest/docs/resources/team_external_group).
     */
    public readonly ignoreExternallySyncedMembers!: pulumi.Output<boolean | undefined>;
    /**
     * A set of email addresses corresponding to users who should be given membership
     * to the team. Note: users specified here must already exist in Grafana.
     */
    public readonly members!: pulumi.Output<string[] | undefined>;
    /**
     * The display name for the Grafana team created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The team id assigned to this team by Grafana.
     */
    public /*out*/ readonly teamId!: pulumi.Output<number>;

    /**
     * Create a Team resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TeamArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TeamArgs | TeamState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TeamState | undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["ignoreExternallySyncedMembers"] = state ? state.ignoreExternallySyncedMembers : undefined;
            resourceInputs["members"] = state ? state.members : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["teamId"] = state ? state.teamId : undefined;
        } else {
            const args = argsOrState as TeamArgs | undefined;
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["ignoreExternallySyncedMembers"] = args ? args.ignoreExternallySyncedMembers : undefined;
            resourceInputs["members"] = args ? args.members : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["teamId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Team.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Team resources.
 */
export interface TeamState {
    /**
     * An email address for the team.
     */
    email?: pulumi.Input<string>;
    /**
     * Ignores team members that have been added to team by [Team
     * Sync](https://grafana.com/docs/grafana/latest/enterprise/team-sync/). Team Sync can be provisioned using
     * [grafana_team_external_group
     * resource](https://registry.terraform.io/providers/grafana/grafana/latest/docs/resources/team_external_group).
     */
    ignoreExternallySyncedMembers?: pulumi.Input<boolean>;
    /**
     * A set of email addresses corresponding to users who should be given membership
     * to the team. Note: users specified here must already exist in Grafana.
     */
    members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The display name for the Grafana team created.
     */
    name?: pulumi.Input<string>;
    /**
     * The team id assigned to this team by Grafana.
     */
    teamId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Team resource.
 */
export interface TeamArgs {
    /**
     * An email address for the team.
     */
    email?: pulumi.Input<string>;
    /**
     * Ignores team members that have been added to team by [Team
     * Sync](https://grafana.com/docs/grafana/latest/enterprise/team-sync/). Team Sync can be provisioned using
     * [grafana_team_external_group
     * resource](https://registry.terraform.io/providers/grafana/grafana/latest/docs/resources/team_external_group).
     */
    ignoreExternallySyncedMembers?: pulumi.Input<boolean>;
    /**
     * A set of email addresses corresponding to users who should be given membership
     * to the team. Note: users specified here must already exist in Grafana.
     */
    members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The display name for the Grafana team created.
     */
    name?: pulumi.Input<string>;
}
