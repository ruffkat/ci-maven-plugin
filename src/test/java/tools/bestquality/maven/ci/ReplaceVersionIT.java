package tools.bestquality.maven.ci;

import com.soebes.itf.jupiter.extension.MavenJupiterExtension;
import com.soebes.itf.jupiter.extension.MavenProject;
import com.soebes.itf.jupiter.extension.MavenRepository;
import com.soebes.itf.jupiter.extension.MavenTest;
import com.soebes.itf.jupiter.maven.MavenExecutionResult;
import org.junit.jupiter.api.Nested;

import static com.soebes.itf.extension.assertj.MavenITAssertions.assertThat;

@MavenRepository
@MavenJupiterExtension
public class ReplaceVersionIT {

    @Nested
    @MavenProject
    class single_module_with_multiple_documents {
        @MavenTest
        void should_replace_all_versions_with_no_system_properties(MavenExecutionResult execution) {
            assertThat(execution)
                    .isSuccessful();
        }
    }
}
