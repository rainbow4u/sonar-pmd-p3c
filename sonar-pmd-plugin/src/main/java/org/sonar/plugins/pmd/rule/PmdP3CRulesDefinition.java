package org.sonar.plugins.pmd.rule;

import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.plugins.pmd.PmdConstants;

/**
 * @author ChangCheng
 * @date 2019/12/25
 **/
public class PmdP3CRulesDefinition implements RulesDefinition {

    @Override
    public void define(Context context) {
        NewRepository repository = context
                .createRepository(PmdConstants.P3C_REPOSITORY_KEY, PmdConstants.LANGUAGE_KEY)
                .setName(PmdConstants.P3C_REPOSITORY_NAME);

        PmdRulesDefinition.extractRulesData(repository, "/org/sonar/plugins/pmd/rules-p3c.xml", "/org/sonar/l10n/pmd/rules/pmd-p3c");

        repository.done();
    }
}
