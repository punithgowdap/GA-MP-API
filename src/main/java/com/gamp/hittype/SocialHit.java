package com.gamp.hittype;

import static com.gamp.config.GoogleAnalyticsParameter.SOCIAL_ACTION;
import static com.gamp.config.GoogleAnalyticsParameter.SOCIAL_ACTION_TARGET;
import static com.gamp.config.GoogleAnalyticsParameter.SOCIAL_NETWORK;

import com.gamp.transport.GoogleAnalyticsRequest;

/**
 * GA request to track social interactions
 *
 * <p>For more information, see <a href="https://developers.google.com/analytics/devguides/collection/protocol/v1/parameters#social">GA Parameters Reference</a></p>
 *
 * @author Punith
 */
public class SocialHit extends GoogleAnalyticsRequest<SocialHit> {

    public SocialHit() {
        this(null, null, null);
    }

    public SocialHit(String socialNetwork, String socialAction, String socialTarget) {
        super("social");
        socialAction(socialAction);
        socialNetwork(socialNetwork);
        socialActionTarget(socialTarget);
    }

    /**
     * <div class="ind">
     * 	<p>
     * 		<strong>Required for social hit type.</strong>
     * 	</p>
     * 	<p>Specifies the social network, for example Facebook or Google Plus.</p>
     * 	<table border="1">
     * 		<tbody>
     * 			<tr>
     * 				<th>Parameter</th>
     * 				<th>Value Type</th>
     * 				<th>Default Value</th>
     * 				<th>Max Length</th>
     * 				<th>Supported Hit Types</th>
     * 			</tr>
     * 			<tr>
     * 				<td><code>sn</code></td>
     * 				<td>text</td>
     * 				<td><span class="none">None</span>
     * 				</td>
     * 				<td>50 Bytes
     * 				</td>
     * 				<td>social</td>
     * 			</tr>
     * 		</tbody>
     * 	</table>
     * 	<div>
     * 		Example value: <code>facebook</code><br>
     * 		Example usage: <code>sn=facebook</code>
     * 	</div>
     * </div>
     */
    public SocialHit socialNetwork(String value) {
        setString(SOCIAL_NETWORK, value);
        return this;
    }

    public String socialNetwork() {
        return getString(SOCIAL_NETWORK);
    }

    /**
     * <div class="ind">
     * 	<p>
     * 		<strong>Required for social hit type.</strong>
     * 	</p>
     * 	<p>Specifies the social interaction action. For example on Google Plus when a user clicks the +1 button, the social action is 'plus'.</p>
     * 	<table border="1">
     * 		<tbody>
     * 			<tr>
     * 				<th>Parameter</th>
     * 				<th>Value Type</th>
     * 				<th>Default Value</th>
     * 				<th>Max Length</th>
     * 				<th>Supported Hit Types</th>
     * 			</tr>
     * 			<tr>
     * 				<td><code>sa</code></td>
     * 				<td>text</td>
     * 				<td><span class="none">None</span>
     * 				</td>
     * 				<td>50 Bytes
     * 				</td>
     * 				<td>social</td>
     * 			</tr>
     * 		</tbody>
     * 	</table>
     * 	<div>
     * 		Example value: <code>like</code><br>
     * 		Example usage: <code>sa=like</code>
     * 	</div>
     * </div>
     */
    public SocialHit socialAction(String value) {
        setString(SOCIAL_ACTION, value);
        return this;
    }

    public String socialAction() {
        return getString(SOCIAL_ACTION);
    }

    /**
     * <div class="ind">
     * 	<p>
     * 		<strong>Required for social hit type.</strong>
     * 	</p>
     * 	<p>Specifies the target of a social interaction. This value is typically a URL but can be any text.</p>
     * 	<table border="1">
     * 		<tbody>
     * 			<tr>
     * 				<th>Parameter</th>
     * 				<th>Value Type</th>
     * 				<th>Default Value</th>
     * 				<th>Max Length</th>
     * 				<th>Supported Hit Types</th>
     * 			</tr>
     * 			<tr>
     * 				<td><code>st</code></td>
     * 				<td>text</td>
     * 				<td><span class="none">None</span>
     * 				</td>
     * 				<td>2048 Bytes
     * 				</td>
     * 				<td>social</td>
     * 			</tr>
     * 		</tbody>
     * 	</table>
     * 	<div>
     * 		Example value: <code>http://foo.com</code><br>
     * 		Example usage: <code>st=http%3A%2F%2Ffoo.com</code>
     * 	</div>
     * </div>
     */
    public SocialHit socialActionTarget(String value) {
        setString(SOCIAL_ACTION_TARGET, value);
        return this;
    }

    public String socialActionTarget() {
        return getString(SOCIAL_ACTION_TARGET);
    }
}
