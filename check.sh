#!/bin/sh
# Exit on failure
set -e

if [ "$TRAVIS_BRANCH" = "master" ] && [ "$TRAVIS_PULL_REQUEST" = "false" ]; then
    # run normal analysis
    mvn -P $SANITY_PROFILE \
        package sonar:sonar \
		-Dsonar.host.url=$SONAR_HOST_URL \
		-Dsonar.login=$SONAR_TOKEN
elif [ "$TRAVIS_PULL_REQUEST" != "false" ] && [ -n "${GITHUB_TOKEN-}" ]; then
    # run PR analysis
	mvn -P $SANITY_PROFILE \
	    package sonar:sonar \
		-Dsonar.host.url=$SONAR_HOST_URL \
		-Dsonar.login=$SONAR_TOKEN \
		-Dsonar.analysis.mode=preview \
		-Dsonar.github.oauth=$GITHUB_TOKEN \
		-Dsonar.github.repository=$TRAVIS_REPO_SLUG \
		-Dsonar.github.pullRequest=$TRAVIS_PULL_REQUEST
else
    # run tests
    mvn -P $SANITY_PROFILE verify
fi