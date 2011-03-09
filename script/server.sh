
project_root="$(dirname $0)/.."
command=${1:-run}

export JPROFILER_HOME="/Users/tommasotorti/Documents/workspace-articolo-performance/jprofiler/jprofiler6"
export CATALINA_HOME="/Users/tommasotorti/Documents/workspace-articolo-performance/tomcat/apache-tomcat-6.0.32"

export CATALINA_BASE="$project_root/tomcat-stuff"
export CATALINA_OPTS="-agentpath:"$JPROFILER_HOME"/bin/macos/libjprofilerti.jnilib=port=8849 $CATALINA_OPTS"


"$CATALINA_HOME/bin/catalina.sh" $command


