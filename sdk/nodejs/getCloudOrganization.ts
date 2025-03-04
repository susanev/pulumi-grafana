// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getCloudOrganization(args?: GetCloudOrganizationArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudOrganizationResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("grafana:index/getCloudOrganization:getCloudOrganization", {
        "id": args.id,
        "slug": args.slug,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudOrganization.
 */
export interface GetCloudOrganizationArgs {
    /**
     * The ID of this resource.
     */
    id?: string;
    slug?: string;
}

/**
 * A collection of values returned by getCloudOrganization.
 */
export interface GetCloudOrganizationResult {
    readonly createdAt: string;
    /**
     * The ID of this resource.
     */
    readonly id: string;
    readonly name: string;
    readonly slug: string;
    readonly updatedAt: string;
    readonly url: string;
}
export function getCloudOrganizationOutput(args?: GetCloudOrganizationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCloudOrganizationResult> {
    return pulumi.output(args).apply((a: any) => getCloudOrganization(a, opts))
}

/**
 * A collection of arguments for invoking getCloudOrganization.
 */
export interface GetCloudOrganizationOutputArgs {
    /**
     * The ID of this resource.
     */
    id?: pulumi.Input<string>;
    slug?: pulumi.Input<string>;
}
