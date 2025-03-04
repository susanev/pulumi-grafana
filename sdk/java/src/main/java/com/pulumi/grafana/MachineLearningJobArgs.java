// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MachineLearningJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final MachineLearningJobArgs Empty = new MachineLearningJobArgs();

    /**
     * An object representing the custom labels added on the forecast.
     * 
     */
    @Import(name="customLabels")
    private @Nullable Output<Map<String,Object>> customLabels;

    /**
     * @return An object representing the custom labels added on the forecast.
     * 
     */
    public Optional<Output<Map<String,Object>>> customLabels() {
        return Optional.ofNullable(this.customLabels);
    }

    /**
     * The id of the datasource to query.
     * 
     */
    @Import(name="datasourceId")
    private @Nullable Output<Integer> datasourceId;

    /**
     * @return The id of the datasource to query.
     * 
     */
    public Optional<Output<Integer>> datasourceId() {
        return Optional.ofNullable(this.datasourceId);
    }

    /**
     * The type of datasource being queried. Currently allowed values are prometheus, graphite, loki, postgres, and datadog.
     * 
     */
    @Import(name="datasourceType", required=true)
    private Output<String> datasourceType;

    /**
     * @return The type of datasource being queried. Currently allowed values are prometheus, graphite, loki, postgres, and datadog.
     * 
     */
    public Output<String> datasourceType() {
        return this.datasourceType;
    }

    /**
     * The uid of the datasource to query.
     * 
     */
    @Import(name="datasourceUid")
    private @Nullable Output<String> datasourceUid;

    /**
     * @return The uid of the datasource to query.
     * 
     */
    public Optional<Output<String>> datasourceUid() {
        return Optional.ofNullable(this.datasourceUid);
    }

    /**
     * A description of the job.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the job.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A list of holiday IDs or names to take into account when training the model.
     * 
     */
    @Import(name="holidays")
    private @Nullable Output<List<String>> holidays;

    /**
     * @return A list of holiday IDs or names to take into account when training the model.
     * 
     */
    public Optional<Output<List<String>>> holidays() {
        return Optional.ofNullable(this.holidays);
    }

    /**
     * The hyperparameters used to fine tune the algorithm. See https://grafana.com/docs/grafana-cloud/machine-learning/models/ for the full list of available hyperparameters. Defaults to `map[]`.
     * 
     */
    @Import(name="hyperParams")
    private @Nullable Output<Map<String,Object>> hyperParams;

    /**
     * @return The hyperparameters used to fine tune the algorithm. See https://grafana.com/docs/grafana-cloud/machine-learning/models/ for the full list of available hyperparameters. Defaults to `map[]`.
     * 
     */
    public Optional<Output<Map<String,Object>>> hyperParams() {
        return Optional.ofNullable(this.hyperParams);
    }

    /**
     * The data interval in seconds to train the data on. Defaults to `300`.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return The data interval in seconds to train the data on. Defaults to `300`.
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * The metric used to query the job results.
     * 
     */
    @Import(name="metric", required=true)
    private Output<String> metric;

    /**
     * @return The metric used to query the job results.
     * 
     */
    public Output<String> metric() {
        return this.metric;
    }

    /**
     * The name of the job.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the job.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An object representing the query params to query Grafana with.
     * 
     */
    @Import(name="queryParams", required=true)
    private Output<Map<String,Object>> queryParams;

    /**
     * @return An object representing the query params to query Grafana with.
     * 
     */
    public Output<Map<String,Object>> queryParams() {
        return this.queryParams;
    }

    /**
     * The data interval in seconds to train the data on. Defaults to `7776000`.
     * 
     */
    @Import(name="trainingWindow")
    private @Nullable Output<Integer> trainingWindow;

    /**
     * @return The data interval in seconds to train the data on. Defaults to `7776000`.
     * 
     */
    public Optional<Output<Integer>> trainingWindow() {
        return Optional.ofNullable(this.trainingWindow);
    }

    private MachineLearningJobArgs() {}

    private MachineLearningJobArgs(MachineLearningJobArgs $) {
        this.customLabels = $.customLabels;
        this.datasourceId = $.datasourceId;
        this.datasourceType = $.datasourceType;
        this.datasourceUid = $.datasourceUid;
        this.description = $.description;
        this.holidays = $.holidays;
        this.hyperParams = $.hyperParams;
        this.interval = $.interval;
        this.metric = $.metric;
        this.name = $.name;
        this.queryParams = $.queryParams;
        this.trainingWindow = $.trainingWindow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MachineLearningJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MachineLearningJobArgs $;

        public Builder() {
            $ = new MachineLearningJobArgs();
        }

        public Builder(MachineLearningJobArgs defaults) {
            $ = new MachineLearningJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customLabels An object representing the custom labels added on the forecast.
         * 
         * @return builder
         * 
         */
        public Builder customLabels(@Nullable Output<Map<String,Object>> customLabels) {
            $.customLabels = customLabels;
            return this;
        }

        /**
         * @param customLabels An object representing the custom labels added on the forecast.
         * 
         * @return builder
         * 
         */
        public Builder customLabels(Map<String,Object> customLabels) {
            return customLabels(Output.of(customLabels));
        }

        /**
         * @param datasourceId The id of the datasource to query.
         * 
         * @return builder
         * 
         */
        public Builder datasourceId(@Nullable Output<Integer> datasourceId) {
            $.datasourceId = datasourceId;
            return this;
        }

        /**
         * @param datasourceId The id of the datasource to query.
         * 
         * @return builder
         * 
         */
        public Builder datasourceId(Integer datasourceId) {
            return datasourceId(Output.of(datasourceId));
        }

        /**
         * @param datasourceType The type of datasource being queried. Currently allowed values are prometheus, graphite, loki, postgres, and datadog.
         * 
         * @return builder
         * 
         */
        public Builder datasourceType(Output<String> datasourceType) {
            $.datasourceType = datasourceType;
            return this;
        }

        /**
         * @param datasourceType The type of datasource being queried. Currently allowed values are prometheus, graphite, loki, postgres, and datadog.
         * 
         * @return builder
         * 
         */
        public Builder datasourceType(String datasourceType) {
            return datasourceType(Output.of(datasourceType));
        }

        /**
         * @param datasourceUid The uid of the datasource to query.
         * 
         * @return builder
         * 
         */
        public Builder datasourceUid(@Nullable Output<String> datasourceUid) {
            $.datasourceUid = datasourceUid;
            return this;
        }

        /**
         * @param datasourceUid The uid of the datasource to query.
         * 
         * @return builder
         * 
         */
        public Builder datasourceUid(String datasourceUid) {
            return datasourceUid(Output.of(datasourceUid));
        }

        /**
         * @param description A description of the job.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the job.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param holidays A list of holiday IDs or names to take into account when training the model.
         * 
         * @return builder
         * 
         */
        public Builder holidays(@Nullable Output<List<String>> holidays) {
            $.holidays = holidays;
            return this;
        }

        /**
         * @param holidays A list of holiday IDs or names to take into account when training the model.
         * 
         * @return builder
         * 
         */
        public Builder holidays(List<String> holidays) {
            return holidays(Output.of(holidays));
        }

        /**
         * @param holidays A list of holiday IDs or names to take into account when training the model.
         * 
         * @return builder
         * 
         */
        public Builder holidays(String... holidays) {
            return holidays(List.of(holidays));
        }

        /**
         * @param hyperParams The hyperparameters used to fine tune the algorithm. See https://grafana.com/docs/grafana-cloud/machine-learning/models/ for the full list of available hyperparameters. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder hyperParams(@Nullable Output<Map<String,Object>> hyperParams) {
            $.hyperParams = hyperParams;
            return this;
        }

        /**
         * @param hyperParams The hyperparameters used to fine tune the algorithm. See https://grafana.com/docs/grafana-cloud/machine-learning/models/ for the full list of available hyperparameters. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder hyperParams(Map<String,Object> hyperParams) {
            return hyperParams(Output.of(hyperParams));
        }

        /**
         * @param interval The data interval in seconds to train the data on. Defaults to `300`.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval The data interval in seconds to train the data on. Defaults to `300`.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param metric The metric used to query the job results.
         * 
         * @return builder
         * 
         */
        public Builder metric(Output<String> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric The metric used to query the job results.
         * 
         * @return builder
         * 
         */
        public Builder metric(String metric) {
            return metric(Output.of(metric));
        }

        /**
         * @param name The name of the job.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the job.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param queryParams An object representing the query params to query Grafana with.
         * 
         * @return builder
         * 
         */
        public Builder queryParams(Output<Map<String,Object>> queryParams) {
            $.queryParams = queryParams;
            return this;
        }

        /**
         * @param queryParams An object representing the query params to query Grafana with.
         * 
         * @return builder
         * 
         */
        public Builder queryParams(Map<String,Object> queryParams) {
            return queryParams(Output.of(queryParams));
        }

        /**
         * @param trainingWindow The data interval in seconds to train the data on. Defaults to `7776000`.
         * 
         * @return builder
         * 
         */
        public Builder trainingWindow(@Nullable Output<Integer> trainingWindow) {
            $.trainingWindow = trainingWindow;
            return this;
        }

        /**
         * @param trainingWindow The data interval in seconds to train the data on. Defaults to `7776000`.
         * 
         * @return builder
         * 
         */
        public Builder trainingWindow(Integer trainingWindow) {
            return trainingWindow(Output.of(trainingWindow));
        }

        public MachineLearningJobArgs build() {
            $.datasourceType = Objects.requireNonNull($.datasourceType, "expected parameter 'datasourceType' to be non-null");
            $.metric = Objects.requireNonNull($.metric, "expected parameter 'metric' to be non-null");
            $.queryParams = Objects.requireNonNull($.queryParams, "expected parameter 'queryParams' to be non-null");
            return $;
        }
    }

}
