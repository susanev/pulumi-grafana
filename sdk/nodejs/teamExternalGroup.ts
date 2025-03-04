// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * * [Official documentation](https://grafana.com/docs/grafana/latest/setup-grafana/configure-security/configure-team-sync/)
 * * [HTTP API](https://grafana.com/docs/grafana/latest/developers/http_api/external_group_sync/)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as grafana from "@lbrlabs/pulumi-grafana";
 *
 * const test_team_group = new grafana.TeamExternalGroup("test-team-group", {
 *     groups: [
 *         "test-group-1",
 *         "test-group-2",
 *     ],
 *     teamId: 1,
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import grafana:index/teamExternalGroup:TeamExternalGroup main {{team_id}}
 * ```
 */
export class TeamExternalGroup extends pulumi.CustomResource {
    /**
     * Get an existing TeamExternalGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TeamExternalGroupState, opts?: pulumi.CustomResourceOptions): TeamExternalGroup {
        return new TeamExternalGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'grafana:index/teamExternalGroup:TeamExternalGroup';

    /**
     * Returns true if the given object is an instance of TeamExternalGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TeamExternalGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TeamExternalGroup.__pulumiType;
    }

    /**
     * The team external groups list
     */
    public readonly groups!: pulumi.Output<string[]>;
    /**
     * The Team ID
     */
    public readonly teamId!: pulumi.Output<number>;

    /**
     * Create a TeamExternalGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TeamExternalGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TeamExternalGroupArgs | TeamExternalGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TeamExternalGroupState | undefined;
            resourceInputs["groups"] = state ? state.groups : undefined;
            resourceInputs["teamId"] = state ? state.teamId : undefined;
        } else {
            const args = argsOrState as TeamExternalGroupArgs | undefined;
            if ((!args || args.groups === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groups'");
            }
            if ((!args || args.teamId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'teamId'");
            }
            resourceInputs["groups"] = args ? args.groups : undefined;
            resourceInputs["teamId"] = args ? args.teamId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TeamExternalGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TeamExternalGroup resources.
 */
export interface TeamExternalGroupState {
    /**
     * The team external groups list
     */
    groups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Team ID
     */
    teamId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a TeamExternalGroup resource.
 */
export interface TeamExternalGroupArgs {
    /**
     * The team external groups list
     */
    groups: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Team ID
     */
    teamId: pulumi.Input<number>;
}
