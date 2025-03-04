// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.grafana.inputs.OncallIntegrationTemplatesEmailArgs;
import com.pulumi.grafana.inputs.OncallIntegrationTemplatesMicrosoftTeamsArgs;
import com.pulumi.grafana.inputs.OncallIntegrationTemplatesPhoneCallArgs;
import com.pulumi.grafana.inputs.OncallIntegrationTemplatesSlackArgs;
import com.pulumi.grafana.inputs.OncallIntegrationTemplatesSmsArgs;
import com.pulumi.grafana.inputs.OncallIntegrationTemplatesTelegramArgs;
import com.pulumi.grafana.inputs.OncallIntegrationTemplatesWebArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OncallIntegrationTemplatesArgs extends com.pulumi.resources.ResourceArgs {

    public static final OncallIntegrationTemplatesArgs Empty = new OncallIntegrationTemplatesArgs();

    /**
     * Template for sending a signal to acknowledge the Incident.
     * 
     */
    @Import(name="acknowledgeSignal")
    private @Nullable Output<String> acknowledgeSignal;

    /**
     * @return Template for sending a signal to acknowledge the Incident.
     * 
     */
    public Optional<Output<String>> acknowledgeSignal() {
        return Optional.ofNullable(this.acknowledgeSignal);
    }

    /**
     * Templates for Email.
     * 
     */
    @Import(name="email")
    private @Nullable Output<OncallIntegrationTemplatesEmailArgs> email;

    /**
     * @return Templates for Email.
     * 
     */
    public Optional<Output<OncallIntegrationTemplatesEmailArgs>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * Template for the key by which alerts are grouped.
     * 
     */
    @Import(name="groupingKey")
    private @Nullable Output<String> groupingKey;

    /**
     * @return Template for the key by which alerts are grouped.
     * 
     */
    public Optional<Output<String>> groupingKey() {
        return Optional.ofNullable(this.groupingKey);
    }

    /**
     * Templates for Microsoft Teams.
     * 
     */
    @Import(name="microsoftTeams")
    private @Nullable Output<OncallIntegrationTemplatesMicrosoftTeamsArgs> microsoftTeams;

    /**
     * @return Templates for Microsoft Teams.
     * 
     */
    public Optional<Output<OncallIntegrationTemplatesMicrosoftTeamsArgs>> microsoftTeams() {
        return Optional.ofNullable(this.microsoftTeams);
    }

    /**
     * Templates for Phone Call.
     * 
     */
    @Import(name="phoneCall")
    private @Nullable Output<OncallIntegrationTemplatesPhoneCallArgs> phoneCall;

    /**
     * @return Templates for Phone Call.
     * 
     */
    public Optional<Output<OncallIntegrationTemplatesPhoneCallArgs>> phoneCall() {
        return Optional.ofNullable(this.phoneCall);
    }

    /**
     * Template for sending a signal to resolve the Incident.
     * 
     */
    @Import(name="resolveSignal")
    private @Nullable Output<String> resolveSignal;

    /**
     * @return Template for sending a signal to resolve the Incident.
     * 
     */
    public Optional<Output<String>> resolveSignal() {
        return Optional.ofNullable(this.resolveSignal);
    }

    /**
     * Templates for Slack.
     * 
     */
    @Import(name="slack")
    private @Nullable Output<OncallIntegrationTemplatesSlackArgs> slack;

    /**
     * @return Templates for Slack.
     * 
     */
    public Optional<Output<OncallIntegrationTemplatesSlackArgs>> slack() {
        return Optional.ofNullable(this.slack);
    }

    /**
     * Templates for SMS.
     * 
     */
    @Import(name="sms")
    private @Nullable Output<OncallIntegrationTemplatesSmsArgs> sms;

    /**
     * @return Templates for SMS.
     * 
     */
    public Optional<Output<OncallIntegrationTemplatesSmsArgs>> sms() {
        return Optional.ofNullable(this.sms);
    }

    /**
     * Template for a source link.
     * 
     */
    @Import(name="sourceLink")
    private @Nullable Output<String> sourceLink;

    /**
     * @return Template for a source link.
     * 
     */
    public Optional<Output<String>> sourceLink() {
        return Optional.ofNullable(this.sourceLink);
    }

    /**
     * Templates for Telegram.
     * 
     */
    @Import(name="telegram")
    private @Nullable Output<OncallIntegrationTemplatesTelegramArgs> telegram;

    /**
     * @return Templates for Telegram.
     * 
     */
    public Optional<Output<OncallIntegrationTemplatesTelegramArgs>> telegram() {
        return Optional.ofNullable(this.telegram);
    }

    /**
     * Templates for Web.
     * 
     */
    @Import(name="web")
    private @Nullable Output<OncallIntegrationTemplatesWebArgs> web;

    /**
     * @return Templates for Web.
     * 
     */
    public Optional<Output<OncallIntegrationTemplatesWebArgs>> web() {
        return Optional.ofNullable(this.web);
    }

    private OncallIntegrationTemplatesArgs() {}

    private OncallIntegrationTemplatesArgs(OncallIntegrationTemplatesArgs $) {
        this.acknowledgeSignal = $.acknowledgeSignal;
        this.email = $.email;
        this.groupingKey = $.groupingKey;
        this.microsoftTeams = $.microsoftTeams;
        this.phoneCall = $.phoneCall;
        this.resolveSignal = $.resolveSignal;
        this.slack = $.slack;
        this.sms = $.sms;
        this.sourceLink = $.sourceLink;
        this.telegram = $.telegram;
        this.web = $.web;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OncallIntegrationTemplatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OncallIntegrationTemplatesArgs $;

        public Builder() {
            $ = new OncallIntegrationTemplatesArgs();
        }

        public Builder(OncallIntegrationTemplatesArgs defaults) {
            $ = new OncallIntegrationTemplatesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acknowledgeSignal Template for sending a signal to acknowledge the Incident.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgeSignal(@Nullable Output<String> acknowledgeSignal) {
            $.acknowledgeSignal = acknowledgeSignal;
            return this;
        }

        /**
         * @param acknowledgeSignal Template for sending a signal to acknowledge the Incident.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgeSignal(String acknowledgeSignal) {
            return acknowledgeSignal(Output.of(acknowledgeSignal));
        }

        /**
         * @param email Templates for Email.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<OncallIntegrationTemplatesEmailArgs> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Templates for Email.
         * 
         * @return builder
         * 
         */
        public Builder email(OncallIntegrationTemplatesEmailArgs email) {
            return email(Output.of(email));
        }

        /**
         * @param groupingKey Template for the key by which alerts are grouped.
         * 
         * @return builder
         * 
         */
        public Builder groupingKey(@Nullable Output<String> groupingKey) {
            $.groupingKey = groupingKey;
            return this;
        }

        /**
         * @param groupingKey Template for the key by which alerts are grouped.
         * 
         * @return builder
         * 
         */
        public Builder groupingKey(String groupingKey) {
            return groupingKey(Output.of(groupingKey));
        }

        /**
         * @param microsoftTeams Templates for Microsoft Teams.
         * 
         * @return builder
         * 
         */
        public Builder microsoftTeams(@Nullable Output<OncallIntegrationTemplatesMicrosoftTeamsArgs> microsoftTeams) {
            $.microsoftTeams = microsoftTeams;
            return this;
        }

        /**
         * @param microsoftTeams Templates for Microsoft Teams.
         * 
         * @return builder
         * 
         */
        public Builder microsoftTeams(OncallIntegrationTemplatesMicrosoftTeamsArgs microsoftTeams) {
            return microsoftTeams(Output.of(microsoftTeams));
        }

        /**
         * @param phoneCall Templates for Phone Call.
         * 
         * @return builder
         * 
         */
        public Builder phoneCall(@Nullable Output<OncallIntegrationTemplatesPhoneCallArgs> phoneCall) {
            $.phoneCall = phoneCall;
            return this;
        }

        /**
         * @param phoneCall Templates for Phone Call.
         * 
         * @return builder
         * 
         */
        public Builder phoneCall(OncallIntegrationTemplatesPhoneCallArgs phoneCall) {
            return phoneCall(Output.of(phoneCall));
        }

        /**
         * @param resolveSignal Template for sending a signal to resolve the Incident.
         * 
         * @return builder
         * 
         */
        public Builder resolveSignal(@Nullable Output<String> resolveSignal) {
            $.resolveSignal = resolveSignal;
            return this;
        }

        /**
         * @param resolveSignal Template for sending a signal to resolve the Incident.
         * 
         * @return builder
         * 
         */
        public Builder resolveSignal(String resolveSignal) {
            return resolveSignal(Output.of(resolveSignal));
        }

        /**
         * @param slack Templates for Slack.
         * 
         * @return builder
         * 
         */
        public Builder slack(@Nullable Output<OncallIntegrationTemplatesSlackArgs> slack) {
            $.slack = slack;
            return this;
        }

        /**
         * @param slack Templates for Slack.
         * 
         * @return builder
         * 
         */
        public Builder slack(OncallIntegrationTemplatesSlackArgs slack) {
            return slack(Output.of(slack));
        }

        /**
         * @param sms Templates for SMS.
         * 
         * @return builder
         * 
         */
        public Builder sms(@Nullable Output<OncallIntegrationTemplatesSmsArgs> sms) {
            $.sms = sms;
            return this;
        }

        /**
         * @param sms Templates for SMS.
         * 
         * @return builder
         * 
         */
        public Builder sms(OncallIntegrationTemplatesSmsArgs sms) {
            return sms(Output.of(sms));
        }

        /**
         * @param sourceLink Template for a source link.
         * 
         * @return builder
         * 
         */
        public Builder sourceLink(@Nullable Output<String> sourceLink) {
            $.sourceLink = sourceLink;
            return this;
        }

        /**
         * @param sourceLink Template for a source link.
         * 
         * @return builder
         * 
         */
        public Builder sourceLink(String sourceLink) {
            return sourceLink(Output.of(sourceLink));
        }

        /**
         * @param telegram Templates for Telegram.
         * 
         * @return builder
         * 
         */
        public Builder telegram(@Nullable Output<OncallIntegrationTemplatesTelegramArgs> telegram) {
            $.telegram = telegram;
            return this;
        }

        /**
         * @param telegram Templates for Telegram.
         * 
         * @return builder
         * 
         */
        public Builder telegram(OncallIntegrationTemplatesTelegramArgs telegram) {
            return telegram(Output.of(telegram));
        }

        /**
         * @param web Templates for Web.
         * 
         * @return builder
         * 
         */
        public Builder web(@Nullable Output<OncallIntegrationTemplatesWebArgs> web) {
            $.web = web;
            return this;
        }

        /**
         * @param web Templates for Web.
         * 
         * @return builder
         * 
         */
        public Builder web(OncallIntegrationTemplatesWebArgs web) {
            return web(Output.of(web));
        }

        public OncallIntegrationTemplatesArgs build() {
            return $;
        }
    }

}
