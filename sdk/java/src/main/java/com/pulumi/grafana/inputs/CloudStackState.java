// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudStackState extends com.pulumi.resources.ResourceArgs {

    public static final CloudStackState Empty = new CloudStackState();

    /**
     * Name of the Alertmanager instance configured for this stack.
     * 
     */
    @Import(name="alertmanagerName")
    private @Nullable Output<String> alertmanagerName;

    /**
     * @return Name of the Alertmanager instance configured for this stack.
     * 
     */
    public Optional<Output<String>> alertmanagerName() {
        return Optional.ofNullable(this.alertmanagerName);
    }

    /**
     * Status of the Alertmanager instance configured for this stack.
     * 
     */
    @Import(name="alertmanagerStatus")
    private @Nullable Output<String> alertmanagerStatus;

    /**
     * @return Status of the Alertmanager instance configured for this stack.
     * 
     */
    public Optional<Output<String>> alertmanagerStatus() {
        return Optional.ofNullable(this.alertmanagerStatus);
    }

    /**
     * Base URL of the Alertmanager instance configured for this stack.
     * 
     */
    @Import(name="alertmanagerUrl")
    private @Nullable Output<String> alertmanagerUrl;

    /**
     * @return Base URL of the Alertmanager instance configured for this stack.
     * 
     */
    public Optional<Output<String>> alertmanagerUrl() {
        return Optional.ofNullable(this.alertmanagerUrl);
    }

    /**
     * User ID of the Alertmanager instance configured for this stack.
     * 
     */
    @Import(name="alertmanagerUserId")
    private @Nullable Output<Integer> alertmanagerUserId;

    /**
     * @return User ID of the Alertmanager instance configured for this stack.
     * 
     */
    public Optional<Output<Integer>> alertmanagerUserId() {
        return Optional.ofNullable(this.alertmanagerUserId);
    }

    /**
     * Description of stack.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of stack.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="graphiteName")
    private @Nullable Output<String> graphiteName;

    public Optional<Output<String>> graphiteName() {
        return Optional.ofNullable(this.graphiteName);
    }

    @Import(name="graphiteStatus")
    private @Nullable Output<String> graphiteStatus;

    public Optional<Output<String>> graphiteStatus() {
        return Optional.ofNullable(this.graphiteStatus);
    }

    @Import(name="graphiteUrl")
    private @Nullable Output<String> graphiteUrl;

    public Optional<Output<String>> graphiteUrl() {
        return Optional.ofNullable(this.graphiteUrl);
    }

    @Import(name="graphiteUserId")
    private @Nullable Output<Integer> graphiteUserId;

    public Optional<Output<Integer>> graphiteUserId() {
        return Optional.ofNullable(this.graphiteUserId);
    }

    @Import(name="logsName")
    private @Nullable Output<String> logsName;

    public Optional<Output<String>> logsName() {
        return Optional.ofNullable(this.logsName);
    }

    @Import(name="logsStatus")
    private @Nullable Output<String> logsStatus;

    public Optional<Output<String>> logsStatus() {
        return Optional.ofNullable(this.logsStatus);
    }

    @Import(name="logsUrl")
    private @Nullable Output<String> logsUrl;

    public Optional<Output<String>> logsUrl() {
        return Optional.ofNullable(this.logsUrl);
    }

    @Import(name="logsUserId")
    private @Nullable Output<Integer> logsUserId;

    public Optional<Output<Integer>> logsUserId() {
        return Optional.ofNullable(this.logsUserId);
    }

    /**
     * Name of stack. Conventionally matches the url of the instance (e.g. “\n\n.grafana.net”).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of stack. Conventionally matches the url of the instance (e.g. “\n\n.grafana.net”).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Organization id to assign to this stack.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<Integer> orgId;

    /**
     * @return Organization id to assign to this stack.
     * 
     */
    public Optional<Output<Integer>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Organization name to assign to this stack.
     * 
     */
    @Import(name="orgName")
    private @Nullable Output<String> orgName;

    /**
     * @return Organization name to assign to this stack.
     * 
     */
    public Optional<Output<String>> orgName() {
        return Optional.ofNullable(this.orgName);
    }

    /**
     * Organization slug to assign to this stack.
     * 
     */
    @Import(name="orgSlug")
    private @Nullable Output<String> orgSlug;

    /**
     * @return Organization slug to assign to this stack.
     * 
     */
    public Optional<Output<String>> orgSlug() {
        return Optional.ofNullable(this.orgSlug);
    }

    /**
     * Prometheus name for this instance.
     * 
     */
    @Import(name="prometheusName")
    private @Nullable Output<String> prometheusName;

    /**
     * @return Prometheus name for this instance.
     * 
     */
    public Optional<Output<String>> prometheusName() {
        return Optional.ofNullable(this.prometheusName);
    }

    /**
     * Use this URL to query hosted metrics data e.g. Prometheus data source in Grafana
     * 
     */
    @Import(name="prometheusRemoteEndpoint")
    private @Nullable Output<String> prometheusRemoteEndpoint;

    /**
     * @return Use this URL to query hosted metrics data e.g. Prometheus data source in Grafana
     * 
     */
    public Optional<Output<String>> prometheusRemoteEndpoint() {
        return Optional.ofNullable(this.prometheusRemoteEndpoint);
    }

    /**
     * Use this URL to send prometheus metrics to Grafana cloud
     * 
     */
    @Import(name="prometheusRemoteWriteEndpoint")
    private @Nullable Output<String> prometheusRemoteWriteEndpoint;

    /**
     * @return Use this URL to send prometheus metrics to Grafana cloud
     * 
     */
    public Optional<Output<String>> prometheusRemoteWriteEndpoint() {
        return Optional.ofNullable(this.prometheusRemoteWriteEndpoint);
    }

    /**
     * Prometheus status for this instance.
     * 
     */
    @Import(name="prometheusStatus")
    private @Nullable Output<String> prometheusStatus;

    /**
     * @return Prometheus status for this instance.
     * 
     */
    public Optional<Output<String>> prometheusStatus() {
        return Optional.ofNullable(this.prometheusStatus);
    }

    /**
     * Prometheus url for this instance.
     * 
     */
    @Import(name="prometheusUrl")
    private @Nullable Output<String> prometheusUrl;

    /**
     * @return Prometheus url for this instance.
     * 
     */
    public Optional<Output<String>> prometheusUrl() {
        return Optional.ofNullable(this.prometheusUrl);
    }

    /**
     * Prometheus user ID. Used for e.g. remote_write.
     * 
     */
    @Import(name="prometheusUserId")
    private @Nullable Output<Integer> prometheusUserId;

    /**
     * @return Prometheus user ID. Used for e.g. remote_write.
     * 
     */
    public Optional<Output<Integer>> prometheusUserId() {
        return Optional.ofNullable(this.prometheusUserId);
    }

    /**
     * Region slug to assign to this stack. Changing region will destroy the existing stack and create a new one in the desired region. Use the region list API to get the list of available regions: https://grafana.com/docs/grafana-cloud/reference/cloud-api/#list-regions.
     * 
     */
    @Import(name="regionSlug")
    private @Nullable Output<String> regionSlug;

    /**
     * @return Region slug to assign to this stack. Changing region will destroy the existing stack and create a new one in the desired region. Use the region list API to get the list of available regions: https://grafana.com/docs/grafana-cloud/reference/cloud-api/#list-regions.
     * 
     */
    public Optional<Output<String>> regionSlug() {
        return Optional.ofNullable(this.regionSlug);
    }

    /**
     * Subdomain that the Grafana instance will be available at (i.e. setting slug to “\n\n” will make the instance
     * available at “https://\n\n.grafana.net&#34;.
     * 
     */
    @Import(name="slug")
    private @Nullable Output<String> slug;

    /**
     * @return Subdomain that the Grafana instance will be available at (i.e. setting slug to “\n\n” will make the instance
     * available at “https://\n\n.grafana.net&#34;.
     * 
     */
    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    /**
     * Status of the stack.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of the stack.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    @Import(name="tracesName")
    private @Nullable Output<String> tracesName;

    public Optional<Output<String>> tracesName() {
        return Optional.ofNullable(this.tracesName);
    }

    @Import(name="tracesStatus")
    private @Nullable Output<String> tracesStatus;

    public Optional<Output<String>> tracesStatus() {
        return Optional.ofNullable(this.tracesStatus);
    }

    @Import(name="tracesUrl")
    private @Nullable Output<String> tracesUrl;

    public Optional<Output<String>> tracesUrl() {
        return Optional.ofNullable(this.tracesUrl);
    }

    @Import(name="tracesUserId")
    private @Nullable Output<Integer> tracesUserId;

    public Optional<Output<Integer>> tracesUserId() {
        return Optional.ofNullable(this.tracesUserId);
    }

    /**
     * Custom URL for the Grafana instance. Must have a CNAME setup to point to `.grafana.net` before creating the stack
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return Custom URL for the Grafana instance. Must have a CNAME setup to point to `.grafana.net` before creating the stack
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * Whether to wait for readiness of the stack after creating it. The check is a HEAD request to the stack URL (Grafana instance). Defaults to `true`.
     * 
     */
    @Import(name="waitForReadiness")
    private @Nullable Output<Boolean> waitForReadiness;

    /**
     * @return Whether to wait for readiness of the stack after creating it. The check is a HEAD request to the stack URL (Grafana instance). Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> waitForReadiness() {
        return Optional.ofNullable(this.waitForReadiness);
    }

    /**
     * How long to wait for readiness (if enabled). Defaults to `5m0s`.
     * 
     */
    @Import(name="waitForReadinessTimeout")
    private @Nullable Output<String> waitForReadinessTimeout;

    /**
     * @return How long to wait for readiness (if enabled). Defaults to `5m0s`.
     * 
     */
    public Optional<Output<String>> waitForReadinessTimeout() {
        return Optional.ofNullable(this.waitForReadinessTimeout);
    }

    private CloudStackState() {}

    private CloudStackState(CloudStackState $) {
        this.alertmanagerName = $.alertmanagerName;
        this.alertmanagerStatus = $.alertmanagerStatus;
        this.alertmanagerUrl = $.alertmanagerUrl;
        this.alertmanagerUserId = $.alertmanagerUserId;
        this.description = $.description;
        this.graphiteName = $.graphiteName;
        this.graphiteStatus = $.graphiteStatus;
        this.graphiteUrl = $.graphiteUrl;
        this.graphiteUserId = $.graphiteUserId;
        this.logsName = $.logsName;
        this.logsStatus = $.logsStatus;
        this.logsUrl = $.logsUrl;
        this.logsUserId = $.logsUserId;
        this.name = $.name;
        this.orgId = $.orgId;
        this.orgName = $.orgName;
        this.orgSlug = $.orgSlug;
        this.prometheusName = $.prometheusName;
        this.prometheusRemoteEndpoint = $.prometheusRemoteEndpoint;
        this.prometheusRemoteWriteEndpoint = $.prometheusRemoteWriteEndpoint;
        this.prometheusStatus = $.prometheusStatus;
        this.prometheusUrl = $.prometheusUrl;
        this.prometheusUserId = $.prometheusUserId;
        this.regionSlug = $.regionSlug;
        this.slug = $.slug;
        this.status = $.status;
        this.tracesName = $.tracesName;
        this.tracesStatus = $.tracesStatus;
        this.tracesUrl = $.tracesUrl;
        this.tracesUserId = $.tracesUserId;
        this.url = $.url;
        this.waitForReadiness = $.waitForReadiness;
        this.waitForReadinessTimeout = $.waitForReadinessTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudStackState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudStackState $;

        public Builder() {
            $ = new CloudStackState();
        }

        public Builder(CloudStackState defaults) {
            $ = new CloudStackState(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertmanagerName Name of the Alertmanager instance configured for this stack.
         * 
         * @return builder
         * 
         */
        public Builder alertmanagerName(@Nullable Output<String> alertmanagerName) {
            $.alertmanagerName = alertmanagerName;
            return this;
        }

        /**
         * @param alertmanagerName Name of the Alertmanager instance configured for this stack.
         * 
         * @return builder
         * 
         */
        public Builder alertmanagerName(String alertmanagerName) {
            return alertmanagerName(Output.of(alertmanagerName));
        }

        /**
         * @param alertmanagerStatus Status of the Alertmanager instance configured for this stack.
         * 
         * @return builder
         * 
         */
        public Builder alertmanagerStatus(@Nullable Output<String> alertmanagerStatus) {
            $.alertmanagerStatus = alertmanagerStatus;
            return this;
        }

        /**
         * @param alertmanagerStatus Status of the Alertmanager instance configured for this stack.
         * 
         * @return builder
         * 
         */
        public Builder alertmanagerStatus(String alertmanagerStatus) {
            return alertmanagerStatus(Output.of(alertmanagerStatus));
        }

        /**
         * @param alertmanagerUrl Base URL of the Alertmanager instance configured for this stack.
         * 
         * @return builder
         * 
         */
        public Builder alertmanagerUrl(@Nullable Output<String> alertmanagerUrl) {
            $.alertmanagerUrl = alertmanagerUrl;
            return this;
        }

        /**
         * @param alertmanagerUrl Base URL of the Alertmanager instance configured for this stack.
         * 
         * @return builder
         * 
         */
        public Builder alertmanagerUrl(String alertmanagerUrl) {
            return alertmanagerUrl(Output.of(alertmanagerUrl));
        }

        /**
         * @param alertmanagerUserId User ID of the Alertmanager instance configured for this stack.
         * 
         * @return builder
         * 
         */
        public Builder alertmanagerUserId(@Nullable Output<Integer> alertmanagerUserId) {
            $.alertmanagerUserId = alertmanagerUserId;
            return this;
        }

        /**
         * @param alertmanagerUserId User ID of the Alertmanager instance configured for this stack.
         * 
         * @return builder
         * 
         */
        public Builder alertmanagerUserId(Integer alertmanagerUserId) {
            return alertmanagerUserId(Output.of(alertmanagerUserId));
        }

        /**
         * @param description Description of stack.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of stack.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder graphiteName(@Nullable Output<String> graphiteName) {
            $.graphiteName = graphiteName;
            return this;
        }

        public Builder graphiteName(String graphiteName) {
            return graphiteName(Output.of(graphiteName));
        }

        public Builder graphiteStatus(@Nullable Output<String> graphiteStatus) {
            $.graphiteStatus = graphiteStatus;
            return this;
        }

        public Builder graphiteStatus(String graphiteStatus) {
            return graphiteStatus(Output.of(graphiteStatus));
        }

        public Builder graphiteUrl(@Nullable Output<String> graphiteUrl) {
            $.graphiteUrl = graphiteUrl;
            return this;
        }

        public Builder graphiteUrl(String graphiteUrl) {
            return graphiteUrl(Output.of(graphiteUrl));
        }

        public Builder graphiteUserId(@Nullable Output<Integer> graphiteUserId) {
            $.graphiteUserId = graphiteUserId;
            return this;
        }

        public Builder graphiteUserId(Integer graphiteUserId) {
            return graphiteUserId(Output.of(graphiteUserId));
        }

        public Builder logsName(@Nullable Output<String> logsName) {
            $.logsName = logsName;
            return this;
        }

        public Builder logsName(String logsName) {
            return logsName(Output.of(logsName));
        }

        public Builder logsStatus(@Nullable Output<String> logsStatus) {
            $.logsStatus = logsStatus;
            return this;
        }

        public Builder logsStatus(String logsStatus) {
            return logsStatus(Output.of(logsStatus));
        }

        public Builder logsUrl(@Nullable Output<String> logsUrl) {
            $.logsUrl = logsUrl;
            return this;
        }

        public Builder logsUrl(String logsUrl) {
            return logsUrl(Output.of(logsUrl));
        }

        public Builder logsUserId(@Nullable Output<Integer> logsUserId) {
            $.logsUserId = logsUserId;
            return this;
        }

        public Builder logsUserId(Integer logsUserId) {
            return logsUserId(Output.of(logsUserId));
        }

        /**
         * @param name Name of stack. Conventionally matches the url of the instance (e.g. “\n\n.grafana.net”).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of stack. Conventionally matches the url of the instance (e.g. “\n\n.grafana.net”).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId Organization id to assign to this stack.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<Integer> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization id to assign to this stack.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Integer orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param orgName Organization name to assign to this stack.
         * 
         * @return builder
         * 
         */
        public Builder orgName(@Nullable Output<String> orgName) {
            $.orgName = orgName;
            return this;
        }

        /**
         * @param orgName Organization name to assign to this stack.
         * 
         * @return builder
         * 
         */
        public Builder orgName(String orgName) {
            return orgName(Output.of(orgName));
        }

        /**
         * @param orgSlug Organization slug to assign to this stack.
         * 
         * @return builder
         * 
         */
        public Builder orgSlug(@Nullable Output<String> orgSlug) {
            $.orgSlug = orgSlug;
            return this;
        }

        /**
         * @param orgSlug Organization slug to assign to this stack.
         * 
         * @return builder
         * 
         */
        public Builder orgSlug(String orgSlug) {
            return orgSlug(Output.of(orgSlug));
        }

        /**
         * @param prometheusName Prometheus name for this instance.
         * 
         * @return builder
         * 
         */
        public Builder prometheusName(@Nullable Output<String> prometheusName) {
            $.prometheusName = prometheusName;
            return this;
        }

        /**
         * @param prometheusName Prometheus name for this instance.
         * 
         * @return builder
         * 
         */
        public Builder prometheusName(String prometheusName) {
            return prometheusName(Output.of(prometheusName));
        }

        /**
         * @param prometheusRemoteEndpoint Use this URL to query hosted metrics data e.g. Prometheus data source in Grafana
         * 
         * @return builder
         * 
         */
        public Builder prometheusRemoteEndpoint(@Nullable Output<String> prometheusRemoteEndpoint) {
            $.prometheusRemoteEndpoint = prometheusRemoteEndpoint;
            return this;
        }

        /**
         * @param prometheusRemoteEndpoint Use this URL to query hosted metrics data e.g. Prometheus data source in Grafana
         * 
         * @return builder
         * 
         */
        public Builder prometheusRemoteEndpoint(String prometheusRemoteEndpoint) {
            return prometheusRemoteEndpoint(Output.of(prometheusRemoteEndpoint));
        }

        /**
         * @param prometheusRemoteWriteEndpoint Use this URL to send prometheus metrics to Grafana cloud
         * 
         * @return builder
         * 
         */
        public Builder prometheusRemoteWriteEndpoint(@Nullable Output<String> prometheusRemoteWriteEndpoint) {
            $.prometheusRemoteWriteEndpoint = prometheusRemoteWriteEndpoint;
            return this;
        }

        /**
         * @param prometheusRemoteWriteEndpoint Use this URL to send prometheus metrics to Grafana cloud
         * 
         * @return builder
         * 
         */
        public Builder prometheusRemoteWriteEndpoint(String prometheusRemoteWriteEndpoint) {
            return prometheusRemoteWriteEndpoint(Output.of(prometheusRemoteWriteEndpoint));
        }

        /**
         * @param prometheusStatus Prometheus status for this instance.
         * 
         * @return builder
         * 
         */
        public Builder prometheusStatus(@Nullable Output<String> prometheusStatus) {
            $.prometheusStatus = prometheusStatus;
            return this;
        }

        /**
         * @param prometheusStatus Prometheus status for this instance.
         * 
         * @return builder
         * 
         */
        public Builder prometheusStatus(String prometheusStatus) {
            return prometheusStatus(Output.of(prometheusStatus));
        }

        /**
         * @param prometheusUrl Prometheus url for this instance.
         * 
         * @return builder
         * 
         */
        public Builder prometheusUrl(@Nullable Output<String> prometheusUrl) {
            $.prometheusUrl = prometheusUrl;
            return this;
        }

        /**
         * @param prometheusUrl Prometheus url for this instance.
         * 
         * @return builder
         * 
         */
        public Builder prometheusUrl(String prometheusUrl) {
            return prometheusUrl(Output.of(prometheusUrl));
        }

        /**
         * @param prometheusUserId Prometheus user ID. Used for e.g. remote_write.
         * 
         * @return builder
         * 
         */
        public Builder prometheusUserId(@Nullable Output<Integer> prometheusUserId) {
            $.prometheusUserId = prometheusUserId;
            return this;
        }

        /**
         * @param prometheusUserId Prometheus user ID. Used for e.g. remote_write.
         * 
         * @return builder
         * 
         */
        public Builder prometheusUserId(Integer prometheusUserId) {
            return prometheusUserId(Output.of(prometheusUserId));
        }

        /**
         * @param regionSlug Region slug to assign to this stack. Changing region will destroy the existing stack and create a new one in the desired region. Use the region list API to get the list of available regions: https://grafana.com/docs/grafana-cloud/reference/cloud-api/#list-regions.
         * 
         * @return builder
         * 
         */
        public Builder regionSlug(@Nullable Output<String> regionSlug) {
            $.regionSlug = regionSlug;
            return this;
        }

        /**
         * @param regionSlug Region slug to assign to this stack. Changing region will destroy the existing stack and create a new one in the desired region. Use the region list API to get the list of available regions: https://grafana.com/docs/grafana-cloud/reference/cloud-api/#list-regions.
         * 
         * @return builder
         * 
         */
        public Builder regionSlug(String regionSlug) {
            return regionSlug(Output.of(regionSlug));
        }

        /**
         * @param slug Subdomain that the Grafana instance will be available at (i.e. setting slug to “\n\n” will make the instance
         * available at “https://\n\n.grafana.net&#34;.
         * 
         * @return builder
         * 
         */
        public Builder slug(@Nullable Output<String> slug) {
            $.slug = slug;
            return this;
        }

        /**
         * @param slug Subdomain that the Grafana instance will be available at (i.e. setting slug to “\n\n” will make the instance
         * available at “https://\n\n.grafana.net&#34;.
         * 
         * @return builder
         * 
         */
        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        /**
         * @param status Status of the stack.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the stack.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder tracesName(@Nullable Output<String> tracesName) {
            $.tracesName = tracesName;
            return this;
        }

        public Builder tracesName(String tracesName) {
            return tracesName(Output.of(tracesName));
        }

        public Builder tracesStatus(@Nullable Output<String> tracesStatus) {
            $.tracesStatus = tracesStatus;
            return this;
        }

        public Builder tracesStatus(String tracesStatus) {
            return tracesStatus(Output.of(tracesStatus));
        }

        public Builder tracesUrl(@Nullable Output<String> tracesUrl) {
            $.tracesUrl = tracesUrl;
            return this;
        }

        public Builder tracesUrl(String tracesUrl) {
            return tracesUrl(Output.of(tracesUrl));
        }

        public Builder tracesUserId(@Nullable Output<Integer> tracesUserId) {
            $.tracesUserId = tracesUserId;
            return this;
        }

        public Builder tracesUserId(Integer tracesUserId) {
            return tracesUserId(Output.of(tracesUserId));
        }

        /**
         * @param url Custom URL for the Grafana instance. Must have a CNAME setup to point to `.grafana.net` before creating the stack
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Custom URL for the Grafana instance. Must have a CNAME setup to point to `.grafana.net` before creating the stack
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param waitForReadiness Whether to wait for readiness of the stack after creating it. The check is a HEAD request to the stack URL (Grafana instance). Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder waitForReadiness(@Nullable Output<Boolean> waitForReadiness) {
            $.waitForReadiness = waitForReadiness;
            return this;
        }

        /**
         * @param waitForReadiness Whether to wait for readiness of the stack after creating it. The check is a HEAD request to the stack URL (Grafana instance). Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder waitForReadiness(Boolean waitForReadiness) {
            return waitForReadiness(Output.of(waitForReadiness));
        }

        /**
         * @param waitForReadinessTimeout How long to wait for readiness (if enabled). Defaults to `5m0s`.
         * 
         * @return builder
         * 
         */
        public Builder waitForReadinessTimeout(@Nullable Output<String> waitForReadinessTimeout) {
            $.waitForReadinessTimeout = waitForReadinessTimeout;
            return this;
        }

        /**
         * @param waitForReadinessTimeout How long to wait for readiness (if enabled). Defaults to `5m0s`.
         * 
         * @return builder
         * 
         */
        public Builder waitForReadinessTimeout(String waitForReadinessTimeout) {
            return waitForReadinessTimeout(Output.of(waitForReadinessTimeout));
        }

        public CloudStackState build() {
            return $;
        }
    }

}
