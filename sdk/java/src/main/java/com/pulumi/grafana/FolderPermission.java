// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.grafana.FolderPermissionArgs;
import com.pulumi.grafana.Utilities;
import com.pulumi.grafana.inputs.FolderPermissionState;
import com.pulumi.grafana.outputs.FolderPermissionPermission;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * * [Official documentation](https://grafana.com/docs/grafana/latest/administration/roles-and-permissions/access-control/)
 * * [HTTP API](https://grafana.com/docs/grafana/latest/developers/http_api/folder_permissions/)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.grafana.Team;
 * import com.pulumi.grafana.User;
 * import com.pulumi.grafana.UserArgs;
 * import com.pulumi.grafana.Folder;
 * import com.pulumi.grafana.FolderArgs;
 * import com.pulumi.grafana.FolderPermission;
 * import com.pulumi.grafana.FolderPermissionArgs;
 * import com.pulumi.grafana.inputs.FolderPermissionPermissionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var team = new Team(&#34;team&#34;);
 * 
 *         var user = new User(&#34;user&#34;, UserArgs.builder()        
 *             .email(&#34;user.name@example.com&#34;)
 *             .build());
 * 
 *         var collection = new Folder(&#34;collection&#34;, FolderArgs.builder()        
 *             .title(&#34;Folder Title&#34;)
 *             .build());
 * 
 *         var collectionPermission = new FolderPermission(&#34;collectionPermission&#34;, FolderPermissionArgs.builder()        
 *             .folderUid(collection.uid())
 *             .permissions(            
 *                 FolderPermissionPermissionArgs.builder()
 *                     .role(&#34;Editor&#34;)
 *                     .permission(&#34;Edit&#34;)
 *                     .build(),
 *                 FolderPermissionPermissionArgs.builder()
 *                     .teamId(team.id())
 *                     .permission(&#34;View&#34;)
 *                     .build(),
 *                 FolderPermissionPermissionArgs.builder()
 *                     .userId(user.id())
 *                     .permission(&#34;Admin&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="grafana:index/folderPermission:FolderPermission")
public class FolderPermission extends com.pulumi.resources.CustomResource {
    /**
     * The UID of the folder.
     * 
     */
    @Export(name="folderUid", refs={String.class}, tree="[0]")
    private Output<String> folderUid;

    /**
     * @return The UID of the folder.
     * 
     */
    public Output<String> folderUid() {
        return this.folderUid;
    }
    /**
     * The permission items to add/update. Items that are omitted from the list will be removed.
     * 
     */
    @Export(name="permissions", refs={List.class,FolderPermissionPermission.class}, tree="[0,1]")
    private Output<List<FolderPermissionPermission>> permissions;

    /**
     * @return The permission items to add/update. Items that are omitted from the list will be removed.
     * 
     */
    public Output<List<FolderPermissionPermission>> permissions() {
        return this.permissions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FolderPermission(String name) {
        this(name, FolderPermissionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FolderPermission(String name, FolderPermissionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FolderPermission(String name, FolderPermissionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("grafana:index/folderPermission:FolderPermission", name, args == null ? FolderPermissionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FolderPermission(String name, Output<String> id, @Nullable FolderPermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("grafana:index/folderPermission:FolderPermission", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FolderPermission get(String name, Output<String> id, @Nullable FolderPermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FolderPermission(name, id, state, options);
    }
}
