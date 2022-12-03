// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Data source for retrieving sets of cloud IPs. See https://grafana.com/docs/grafana-cloud/reference/allow-list/ for more info
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as grafana from "@pulumi/grafana";
 *
 * const test = grafana.getCloudIps({});
 * ```
 */
export function getCloudIps(opts?: pulumi.InvokeOptions): Promise<GetCloudIpsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("grafana:index/getCloudIps:getCloudIps", {
    }, opts);
}

/**
 * A collection of values returned by getCloudIps.
 */
export interface GetCloudIpsResult {
    /**
     * Set of IP addresses that are used for hosted alerts.
     */
    readonly hostedAlerts: string[];
    /**
     * Set of IP addresses that are used for hosted Grafana.
     */
    readonly hostedGrafanas: string[];
    /**
     * Set of IP addresses that are used for hosted logs.
     */
    readonly hostedLogs: string[];
    /**
     * Set of IP addresses that are used for hosted metrics.
     */
    readonly hostedMetrics: string[];
    /**
     * Set of IP addresses that are used for hosted traces.
     */
    readonly hostedTraces: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
