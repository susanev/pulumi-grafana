// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as grafana from "@pulumi/grafana";
 *
 * const exampleTeam = grafana.getOncallTeam({
 *     name: "example_team",
 * });
 * ```
 */
export function getOncallTeam(args: GetOncallTeamArgs, opts?: pulumi.InvokeOptions): Promise<GetOncallTeamResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("grafana:index/getOncallTeam:getOncallTeam", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getOncallTeam.
 */
export interface GetOncallTeamArgs {
    /**
     * The team name.
     */
    name: string;
}

/**
 * A collection of values returned by getOncallTeam.
 */
export interface GetOncallTeamResult {
    readonly avatarUrl: string;
    readonly email: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The team name.
     */
    readonly name: string;
}

export function getOncallTeamOutput(args: GetOncallTeamOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetOncallTeamResult> {
    return pulumi.output(args).apply(a => getOncallTeam(a, opts))
}

/**
 * A collection of arguments for invoking getOncallTeam.
 */
export interface GetOncallTeamOutputArgs {
    /**
     * The team name.
     */
    name: pulumi.Input<string>;
}
