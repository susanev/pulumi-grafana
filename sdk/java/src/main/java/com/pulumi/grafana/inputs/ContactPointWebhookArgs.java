// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContactPointWebhookArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContactPointWebhookArgs Empty = new ContactPointWebhookArgs();

    /**
     * Allows a custom authorization scheme - attaches an auth header with this value. Do not use in conjunction with basic auth parameters.
     * 
     */
    @Import(name="authorizationCredentials")
    private @Nullable Output<String> authorizationCredentials;

    /**
     * @return Allows a custom authorization scheme - attaches an auth header with this value. Do not use in conjunction with basic auth parameters.
     * 
     */
    public Optional<Output<String>> authorizationCredentials() {
        return Optional.ofNullable(this.authorizationCredentials);
    }

    /**
     * Allows a custom authorization scheme - attaches an auth header with this name. Do not use in conjunction with basic auth parameters.
     * 
     */
    @Import(name="authorizationScheme")
    private @Nullable Output<String> authorizationScheme;

    /**
     * @return Allows a custom authorization scheme - attaches an auth header with this name. Do not use in conjunction with basic auth parameters.
     * 
     */
    public Optional<Output<String>> authorizationScheme() {
        return Optional.ofNullable(this.authorizationScheme);
    }

    /**
     * The username to use in basic auth headers attached to the request. If omitted, basic auth will not be used.
     * 
     */
    @Import(name="basicAuthPassword")
    private @Nullable Output<String> basicAuthPassword;

    /**
     * @return The username to use in basic auth headers attached to the request. If omitted, basic auth will not be used.
     * 
     */
    public Optional<Output<String>> basicAuthPassword() {
        return Optional.ofNullable(this.basicAuthPassword);
    }

    /**
     * The username to use in basic auth headers attached to the request. If omitted, basic auth will not be used.
     * 
     */
    @Import(name="basicAuthUser")
    private @Nullable Output<String> basicAuthUser;

    /**
     * @return The username to use in basic auth headers attached to the request. If omitted, basic auth will not be used.
     * 
     */
    public Optional<Output<String>> basicAuthUser() {
        return Optional.ofNullable(this.basicAuthUser);
    }

    /**
     * Whether to disable sending resolve messages. Defaults to `false`.
     * 
     */
    @Import(name="disableResolveMessage")
    private @Nullable Output<Boolean> disableResolveMessage;

    /**
     * @return Whether to disable sending resolve messages. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> disableResolveMessage() {
        return Optional.ofNullable(this.disableResolveMessage);
    }

    /**
     * The HTTP method to use in the request. Defaults to `POST`.
     * 
     */
    @Import(name="httpMethod")
    private @Nullable Output<String> httpMethod;

    /**
     * @return The HTTP method to use in the request. Defaults to `POST`.
     * 
     */
    public Optional<Output<String>> httpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }

    /**
     * The maximum number of alerts to send in a single request. This can be helpful in limiting the size of the request body. The default is 0, which indicates no limit.
     * 
     */
    @Import(name="maxAlerts")
    private @Nullable Output<Integer> maxAlerts;

    /**
     * @return The maximum number of alerts to send in a single request. This can be helpful in limiting the size of the request body. The default is 0, which indicates no limit.
     * 
     */
    public Optional<Output<Integer>> maxAlerts() {
        return Optional.ofNullable(this.maxAlerts);
    }

    /**
     * Custom message. You can use template variables.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return Custom message. You can use template variables.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Additional custom properties to attach to the notifier. Defaults to `map[]`.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<Map<String,String>> settings;

    /**
     * @return Additional custom properties to attach to the notifier. Defaults to `map[]`.
     * 
     */
    public Optional<Output<Map<String,String>>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * Templated title of the message.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Templated title of the message.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * The UID of the contact point.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return The UID of the contact point.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    /**
     * The URL to send webhook requests to.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The URL to send webhook requests to.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private ContactPointWebhookArgs() {}

    private ContactPointWebhookArgs(ContactPointWebhookArgs $) {
        this.authorizationCredentials = $.authorizationCredentials;
        this.authorizationScheme = $.authorizationScheme;
        this.basicAuthPassword = $.basicAuthPassword;
        this.basicAuthUser = $.basicAuthUser;
        this.disableResolveMessage = $.disableResolveMessage;
        this.httpMethod = $.httpMethod;
        this.maxAlerts = $.maxAlerts;
        this.message = $.message;
        this.settings = $.settings;
        this.title = $.title;
        this.uid = $.uid;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContactPointWebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactPointWebhookArgs $;

        public Builder() {
            $ = new ContactPointWebhookArgs();
        }

        public Builder(ContactPointWebhookArgs defaults) {
            $ = new ContactPointWebhookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationCredentials Allows a custom authorization scheme - attaches an auth header with this value. Do not use in conjunction with basic auth parameters.
         * 
         * @return builder
         * 
         */
        public Builder authorizationCredentials(@Nullable Output<String> authorizationCredentials) {
            $.authorizationCredentials = authorizationCredentials;
            return this;
        }

        /**
         * @param authorizationCredentials Allows a custom authorization scheme - attaches an auth header with this value. Do not use in conjunction with basic auth parameters.
         * 
         * @return builder
         * 
         */
        public Builder authorizationCredentials(String authorizationCredentials) {
            return authorizationCredentials(Output.of(authorizationCredentials));
        }

        /**
         * @param authorizationScheme Allows a custom authorization scheme - attaches an auth header with this name. Do not use in conjunction with basic auth parameters.
         * 
         * @return builder
         * 
         */
        public Builder authorizationScheme(@Nullable Output<String> authorizationScheme) {
            $.authorizationScheme = authorizationScheme;
            return this;
        }

        /**
         * @param authorizationScheme Allows a custom authorization scheme - attaches an auth header with this name. Do not use in conjunction with basic auth parameters.
         * 
         * @return builder
         * 
         */
        public Builder authorizationScheme(String authorizationScheme) {
            return authorizationScheme(Output.of(authorizationScheme));
        }

        /**
         * @param basicAuthPassword The username to use in basic auth headers attached to the request. If omitted, basic auth will not be used.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthPassword(@Nullable Output<String> basicAuthPassword) {
            $.basicAuthPassword = basicAuthPassword;
            return this;
        }

        /**
         * @param basicAuthPassword The username to use in basic auth headers attached to the request. If omitted, basic auth will not be used.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthPassword(String basicAuthPassword) {
            return basicAuthPassword(Output.of(basicAuthPassword));
        }

        /**
         * @param basicAuthUser The username to use in basic auth headers attached to the request. If omitted, basic auth will not be used.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthUser(@Nullable Output<String> basicAuthUser) {
            $.basicAuthUser = basicAuthUser;
            return this;
        }

        /**
         * @param basicAuthUser The username to use in basic auth headers attached to the request. If omitted, basic auth will not be used.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthUser(String basicAuthUser) {
            return basicAuthUser(Output.of(basicAuthUser));
        }

        /**
         * @param disableResolveMessage Whether to disable sending resolve messages. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableResolveMessage(@Nullable Output<Boolean> disableResolveMessage) {
            $.disableResolveMessage = disableResolveMessage;
            return this;
        }

        /**
         * @param disableResolveMessage Whether to disable sending resolve messages. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableResolveMessage(Boolean disableResolveMessage) {
            return disableResolveMessage(Output.of(disableResolveMessage));
        }

        /**
         * @param httpMethod The HTTP method to use in the request. Defaults to `POST`.
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(@Nullable Output<String> httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        /**
         * @param httpMethod The HTTP method to use in the request. Defaults to `POST`.
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(String httpMethod) {
            return httpMethod(Output.of(httpMethod));
        }

        /**
         * @param maxAlerts The maximum number of alerts to send in a single request. This can be helpful in limiting the size of the request body. The default is 0, which indicates no limit.
         * 
         * @return builder
         * 
         */
        public Builder maxAlerts(@Nullable Output<Integer> maxAlerts) {
            $.maxAlerts = maxAlerts;
            return this;
        }

        /**
         * @param maxAlerts The maximum number of alerts to send in a single request. This can be helpful in limiting the size of the request body. The default is 0, which indicates no limit.
         * 
         * @return builder
         * 
         */
        public Builder maxAlerts(Integer maxAlerts) {
            return maxAlerts(Output.of(maxAlerts));
        }

        /**
         * @param message Custom message. You can use template variables.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Custom message. You can use template variables.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param settings Additional custom properties to attach to the notifier. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<Map<String,String>> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings Additional custom properties to attach to the notifier. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder settings(Map<String,String> settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param title Templated title of the message.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Templated title of the message.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param uid The UID of the contact point.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid The UID of the contact point.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        /**
         * @param url The URL to send webhook requests to.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL to send webhook requests to.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public ContactPointWebhookArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
