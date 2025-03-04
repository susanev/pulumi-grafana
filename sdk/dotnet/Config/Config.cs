// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Lbrlabs.PulumiPackage.Grafana
{
    public static class Config
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("grafana");

        private static readonly __Value<string?> _auth = new __Value<string?>(() => __config.Get("auth") ?? Utilities.GetEnv("GRAFANA_AUTH"));
        /// <summary>
        /// API token, basic auth in the `username:password` format or `anonymous` (string literal). May alternatively be set via
        /// the `GRAFANA_AUTH` environment variable.
        /// </summary>
        public static string? Auth
        {
            get => _auth.Get();
            set => _auth.Set(value);
        }

        private static readonly __Value<string?> _caCert = new __Value<string?>(() => __config.Get("caCert") ?? Utilities.GetEnv("GRAFANA_CA_CERT"));
        /// <summary>
        /// Certificate CA bundle to use to verify the Grafana server's certificate. May alternatively be set via the
        /// `GRAFANA_CA_CERT` environment variable.
        /// </summary>
        public static string? CaCert
        {
            get => _caCert.Get();
            set => _caCert.Set(value);
        }

        private static readonly __Value<string?> _cloudApiKey = new __Value<string?>(() => __config.Get("cloudApiKey") ?? Utilities.GetEnv("GRAFANA_CLOUD_API_KEY"));
        /// <summary>
        /// API key for Grafana Cloud. May alternatively be set via the `GRAFANA_CLOUD_API_KEY` environment variable.
        /// </summary>
        public static string? CloudApiKey
        {
            get => _cloudApiKey.Get();
            set => _cloudApiKey.Set(value);
        }

        private static readonly __Value<string?> _cloudApiUrl = new __Value<string?>(() => __config.Get("cloudApiUrl") ?? Utilities.GetEnv("GRAFANA_CLOUD_API_URL"));
        /// <summary>
        /// Grafana Cloud's API URL. May alternatively be set via the `GRAFANA_CLOUD_API_URL` environment variable.
        /// </summary>
        public static string? CloudApiUrl
        {
            get => _cloudApiUrl.Get();
            set => _cloudApiUrl.Set(value);
        }

        private static readonly __Value<ImmutableDictionary<string, string>?> _httpHeaders = new __Value<ImmutableDictionary<string, string>?>(() => __config.GetObject<ImmutableDictionary<string, string>>("httpHeaders"));
        /// <summary>
        /// Optional. HTTP headers mapping keys to values used for accessing the Grafana and Grafana Cloud APIs. May alternatively
        /// be set via the `GRAFANA_HTTP_HEADERS` environment variable in JSON format.
        /// </summary>
        public static ImmutableDictionary<string, string>? HttpHeaders
        {
            get => _httpHeaders.Get();
            set => _httpHeaders.Set(value);
        }

        private static readonly __Value<bool?> _insecureSkipVerify = new __Value<bool?>(() => __config.GetBoolean("insecureSkipVerify") ?? Utilities.GetEnvBoolean("GRAFANA_INSECURE_SKIP_VERIFY"));
        /// <summary>
        /// Skip TLS certificate verification. May alternatively be set via the `GRAFANA_INSECURE_SKIP_VERIFY` environment variable.
        /// </summary>
        public static bool? InsecureSkipVerify
        {
            get => _insecureSkipVerify.Get();
            set => _insecureSkipVerify.Set(value);
        }

        private static readonly __Value<string?> _oncallAccessToken = new __Value<string?>(() => __config.Get("oncallAccessToken") ?? Utilities.GetEnv("GRAFANA_ONCALL_ACCESS_TOKEN"));
        /// <summary>
        /// A Grafana OnCall access token. May alternatively be set via the `GRAFANA_ONCALL_ACCESS_TOKEN` environment variable.
        /// </summary>
        public static string? OncallAccessToken
        {
            get => _oncallAccessToken.Get();
            set => _oncallAccessToken.Set(value);
        }

        private static readonly __Value<string?> _oncallUrl = new __Value<string?>(() => __config.Get("oncallUrl") ?? Utilities.GetEnv("GRAFANA_ONCALL_URL"));
        /// <summary>
        /// An Grafana OnCall backend address. May alternatively be set via the `GRAFANA_ONCALL_URL` environment variable.
        /// </summary>
        public static string? OncallUrl
        {
            get => _oncallUrl.Get();
            set => _oncallUrl.Set(value);
        }

        private static readonly __Value<int?> _orgId = new __Value<int?>(() => __config.GetInt32("orgId") ?? Utilities.GetEnvInt32("GRAFANA_ORG_ID"));
        /// <summary>
        /// The default organization id to operate on within grafana. For resources that have an `org_id` attribute, the
        /// resource-level attribute has priority. May alternatively be set via the `GRAFANA_ORG_ID` environment variable.
        /// </summary>
        public static int? OrgId
        {
            get => _orgId.Get();
            set => _orgId.Set(value);
        }

        private static readonly __Value<int?> _retries = new __Value<int?>(() => __config.GetInt32("retries") ?? Utilities.GetEnvInt32("GRAFANA_RETRIES"));
        /// <summary>
        /// The amount of retries to use for Grafana API and Grafana Cloud API calls. May alternatively be set via the
        /// `GRAFANA_RETRIES` environment variable.
        /// </summary>
        public static int? Retries
        {
            get => _retries.Get();
            set => _retries.Set(value);
        }

        private static readonly __Value<string?> _smAccessToken = new __Value<string?>(() => __config.Get("smAccessToken") ?? Utilities.GetEnv("GRAFANA_SM_ACCESS_TOKEN"));
        /// <summary>
        /// A Synthetic Monitoring access token. May alternatively be set via the `GRAFANA_SM_ACCESS_TOKEN` environment variable.
        /// </summary>
        public static string? SmAccessToken
        {
            get => _smAccessToken.Get();
            set => _smAccessToken.Set(value);
        }

        private static readonly __Value<string?> _smUrl = new __Value<string?>(() => __config.Get("smUrl") ?? Utilities.GetEnv("GRAFANA_SM_URL"));
        /// <summary>
        /// Synthetic monitoring backend address. May alternatively be set via the `GRAFANA_SM_URL` environment variable. The
        /// correct value for each service region is cited in the [Synthetic Monitoring
        /// documentation](https://grafana.com/docs/grafana-cloud/synthetic-monitoring/private-probes/#probe-api-server-url). Note
        /// the `sm_url` value is optional, but it must correspond with the value specified as the `region_slug` in the
        /// `grafana_cloud_stack` resource. Also note that when a Terraform configuration contains multiple provider instances
        /// managing SM resources associated with the same Grafana stack, specifying an explicit `sm_url` set to the same value for
        /// each provider ensures all providers interact with the same SM API.
        /// </summary>
        public static string? SmUrl
        {
            get => _smUrl.Get();
            set => _smUrl.Set(value);
        }

        private static readonly __Value<bool?> _storeDashboardSha256 = new __Value<bool?>(() => __config.GetBoolean("storeDashboardSha256") ?? Utilities.GetEnvBoolean("GRAFANA_STORE_DASHBOARD_SHA256"));
        /// <summary>
        /// Set to true if you want to save only the sha256sum instead of complete dashboard model JSON in the tfstate.
        /// </summary>
        public static bool? StoreDashboardSha256
        {
            get => _storeDashboardSha256.Get();
            set => _storeDashboardSha256.Set(value);
        }

        private static readonly __Value<string?> _tlsCert = new __Value<string?>(() => __config.Get("tlsCert") ?? Utilities.GetEnv("GRAFANA_TLS_CERT"));
        /// <summary>
        /// Client TLS certificate file to use to authenticate to the Grafana server. May alternatively be set via the
        /// `GRAFANA_TLS_CERT` environment variable.
        /// </summary>
        public static string? TlsCert
        {
            get => _tlsCert.Get();
            set => _tlsCert.Set(value);
        }

        private static readonly __Value<string?> _tlsKey = new __Value<string?>(() => __config.Get("tlsKey") ?? Utilities.GetEnv("GRAFANA_TLS_KEY"));
        /// <summary>
        /// Client TLS key file to use to authenticate to the Grafana server. May alternatively be set via the `GRAFANA_TLS_KEY`
        /// environment variable.
        /// </summary>
        public static string? TlsKey
        {
            get => _tlsKey.Get();
            set => _tlsKey.Set(value);
        }

        private static readonly __Value<string?> _url = new __Value<string?>(() => __config.Get("url") ?? Utilities.GetEnv("GRAFANA_URL"));
        /// <summary>
        /// The root URL of a Grafana server. May alternatively be set via the `GRAFANA_URL` environment variable.
        /// </summary>
        public static string? Url
        {
            get => _url.Get();
            set => _url.Set(value);
        }

    }
}
