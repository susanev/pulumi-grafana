// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Sets up Synthetic Monitoring on a Grafana cloud stack and generates a token.
 * Once a Grafana Cloud stack is created, a user can either use this resource or go into the UI to install synthetic monitoring.
 * This resource cannot be imported but it can be used on an existing Synthetic Monitoring installation without issues.
 *
 * * [Official documentation](https://grafana.com/docs/grafana-cloud/synthetic-monitoring/installation/)
 * * [API documentation](https://github.com/grafana/synthetic-monitoring-api-go-client/blob/main/docs/API.md#apiv1registerinstall)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as grafana from "@lbrlabs/pulumi-grafana";
 *
 * const smStackCloudStack = new grafana.CloudStack("smStackCloudStack", {
 *     slug: "<stack-slug>",
 *     regionSlug: "us",
 * });
 * const metricsPublish = new grafana.CloudApiKey("metricsPublish", {
 *     role: "MetricsPublisher",
 *     cloudOrgSlug: "<org-slug>",
 * });
 * const smStackSyntheticMonitoringInstallation = new grafana.SyntheticMonitoringInstallation("smStackSyntheticMonitoringInstallation", {
 *     stackId: smStackCloudStack.id,
 *     metricsInstanceId: smStackCloudStack.prometheusUserId,
 *     logsInstanceId: smStackCloudStack.logsUserId,
 *     metricsPublisherKey: metricsPublish.key,
 * });
 * ```
 */
export class SyntheticMonitoringInstallation extends pulumi.CustomResource {
    /**
     * Get an existing SyntheticMonitoringInstallation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SyntheticMonitoringInstallationState, opts?: pulumi.CustomResourceOptions): SyntheticMonitoringInstallation {
        return new SyntheticMonitoringInstallation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'grafana:index/syntheticMonitoringInstallation:SyntheticMonitoringInstallation';

    /**
     * Returns true if the given object is an instance of SyntheticMonitoringInstallation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SyntheticMonitoringInstallation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SyntheticMonitoringInstallation.__pulumiType;
    }

    /**
     * The ID of the logs instance to install SM on (stack's `logsUserId` attribute).
     */
    public readonly logsInstanceId!: pulumi.Output<number>;
    /**
     * The ID of the metrics instance to install SM on (stack's `prometheusUserId` attribute).
     */
    public readonly metricsInstanceId!: pulumi.Output<number>;
    /**
     * The Cloud API Key with the `MetricsPublisher` role used to publish metrics to the SM API
     */
    public readonly metricsPublisherKey!: pulumi.Output<string>;
    /**
     * Generated token to access the SM API.
     */
    public /*out*/ readonly smAccessToken!: pulumi.Output<string>;
    /**
     * The ID of the stack to install SM on.
     */
    public readonly stackId!: pulumi.Output<number>;

    /**
     * Create a SyntheticMonitoringInstallation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SyntheticMonitoringInstallationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SyntheticMonitoringInstallationArgs | SyntheticMonitoringInstallationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SyntheticMonitoringInstallationState | undefined;
            resourceInputs["logsInstanceId"] = state ? state.logsInstanceId : undefined;
            resourceInputs["metricsInstanceId"] = state ? state.metricsInstanceId : undefined;
            resourceInputs["metricsPublisherKey"] = state ? state.metricsPublisherKey : undefined;
            resourceInputs["smAccessToken"] = state ? state.smAccessToken : undefined;
            resourceInputs["stackId"] = state ? state.stackId : undefined;
        } else {
            const args = argsOrState as SyntheticMonitoringInstallationArgs | undefined;
            if ((!args || args.logsInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'logsInstanceId'");
            }
            if ((!args || args.metricsInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'metricsInstanceId'");
            }
            if ((!args || args.metricsPublisherKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'metricsPublisherKey'");
            }
            if ((!args || args.stackId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'stackId'");
            }
            resourceInputs["logsInstanceId"] = args ? args.logsInstanceId : undefined;
            resourceInputs["metricsInstanceId"] = args ? args.metricsInstanceId : undefined;
            resourceInputs["metricsPublisherKey"] = args?.metricsPublisherKey ? pulumi.secret(args.metricsPublisherKey) : undefined;
            resourceInputs["stackId"] = args ? args.stackId : undefined;
            resourceInputs["smAccessToken"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["metricsPublisherKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SyntheticMonitoringInstallation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SyntheticMonitoringInstallation resources.
 */
export interface SyntheticMonitoringInstallationState {
    /**
     * The ID of the logs instance to install SM on (stack's `logsUserId` attribute).
     */
    logsInstanceId?: pulumi.Input<number>;
    /**
     * The ID of the metrics instance to install SM on (stack's `prometheusUserId` attribute).
     */
    metricsInstanceId?: pulumi.Input<number>;
    /**
     * The Cloud API Key with the `MetricsPublisher` role used to publish metrics to the SM API
     */
    metricsPublisherKey?: pulumi.Input<string>;
    /**
     * Generated token to access the SM API.
     */
    smAccessToken?: pulumi.Input<string>;
    /**
     * The ID of the stack to install SM on.
     */
    stackId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a SyntheticMonitoringInstallation resource.
 */
export interface SyntheticMonitoringInstallationArgs {
    /**
     * The ID of the logs instance to install SM on (stack's `logsUserId` attribute).
     */
    logsInstanceId: pulumi.Input<number>;
    /**
     * The ID of the metrics instance to install SM on (stack's `prometheusUserId` attribute).
     */
    metricsInstanceId: pulumi.Input<number>;
    /**
     * The Cloud API Key with the `MetricsPublisher` role used to publish metrics to the SM API
     */
    metricsPublisherKey: pulumi.Input<string>;
    /**
     * The ID of the stack to install SM on.
     */
    stackId: pulumi.Input<number>;
}
