-- Create the alien species database
CREATE TABLE alien_species (
    id INT PRIMARY KEY,
    species_name VARCHAR(50) NOT NULL,
    body_structure TEXT NOT NULL,
    lifespan VARCHAR(50) NOT NULL,
    planet_geography TEXT NOT NULL,
    food_sources TEXT NOT NULL,
    group_organization TEXT NOT NULL,
    reproduction TEXT NOT NULL,
    development_of_society TEXT NOT NULL,
    population_growth TEXT NOT NULL
);

-- Insert 10 alien species
INSERT INTO alien_species VALUES
(1, 'Zortians', 
   'Bipedal crystalline beings with silicon-based cellular structure. Average height 2.1m with four arms and translucent skin that changes color based on emotional state.', 
   '450-500 Earth years', 
   'High-gravity planet with dense crystalline mountains, acidic oceans, and minimal vegetation. Atmosphere rich in silicon compounds.', 
   'Absorb energy directly from their star through specialized organs. Consume mineral compounds and crystalline formations.', 
   'Hierarchical hive-mind with interconnected consciousness. Communities of 500-1000 organized around elder councils with specialized worker classes.', 
   'Asexual crystalline budding that occurs once every 75 Earth years. New offspring grows from parent''s crystalline matrix before separating.', 
   'Advanced technological civilization with focus on energy manipulation and crystalline computing. Minimal resource requirements led to peaceful expansion.', 
   'Slow but steady growth of 0.5% annually. Population doubled over 1000 years with periodic plateaus during resource scarcity events.'),

(2, 'Aquarians', 
   'Aquatic cephalopod-like beings with twelve tentacles and distributed neural networks. Bodies contain bioluminescent organs and can change shape and color.', 
   '120-150 Earth years', 
   'Ocean world with minimal land masses. Deep trenches and underwater volcanic activity. Dense atmosphere with high oxygen content.', 
   'Filter feeding of microorganisms and cultivation of algae gardens. Occasional hunting of larger aquatic creatures.', 
   'Fluid social structures based on temporary alliances. No permanent leaders but temporary councils form for specific projects.', 
   'Hermaphroditic with elaborate mating rituals. Eggs are laid in communal nurseries and cared for by specialized caretakers.', 
   'Underwater cities built from coral-like structures. Advanced biotechnology rather than metallic technology. Communication through color patterns and sonar.', 
   'Rapid growth of 2.1% annually with cyclical population crashes every 300 years due to algae bloom disruptions.'),

(3, 'Volarians', 
   'Avian humanoids with hollow bones, feathered wings, and enhanced vision. Average height 1.6m with specialized air sacs for high-altitude flight.', 
   '60-80 Earth years', 
   'Low-gravity planet with floating islands and constant wind currents. Thin atmosphere with high oxygen content at lower altitudes.', 
   'Omnivorous diet of fruits, seeds, and small animals. Developed agriculture in floating gardens and vertical farms.', 
   'Clan-based society with territorial boundaries. Leadership determined by flight skill and hunting prowess.', 
   'Seasonal mating with elaborate aerial courtship displays. Monogamous pairs raise 2-3 offspring per season in communal nests.', 
   'Wind and solar powered technology. Architecture designed around flight and vertical space. Trading networks span their entire world.', 
   'Moderate growth of 1.2% annually with significant fluctuations tied to territory availability and seasonal changes.'),

(4, 'Terraformis', 
   'Plant-animal hybrids with chlorophyll-infused skin and root-like lower extremities. Mobile during youth, becoming more stationary with age.', 
   '800-1000 Earth years', 
   'Jungle planet with intense solar radiation and frequent rainfall. Rich soil and diverse ecosystem with minimal seasonal variation.', 
   'Photosynthesis provides primary energy. Supplement with soil nutrients and occasional insect consumption.', 
   'Grove communities centered around elder patriarch/matriarch trees. Youth serve as messengers and gatherers while elders form deep root networks.', 
   'Pollen exchange between individuals followed by seed development. Seeds require specific soil conditions to germinate.', 
   'Biological architecture integrated with living trees. Technology based on organic chemistry and bioengineering rather than electronics.', 
   'Extremely slow growth of 0.1% annually with significant boosts after major rainfall events. Population has tripled over 5000 years.'),

(5, 'Mechanoforms', 
   'Silicon-based machine intelligences with modular body components. Can reconfigure physical form based on needs and environment.', 
   '2000+ Earth years with regular maintenance', 
   'Desert world with extreme temperature variations and frequent electrical storms. Rich in rare minerals and metallic compounds.', 
   'Solar energy and electrical currents. Consume rare minerals and metals to maintain physical structure.', 
   'Networked intelligence with specialized units serving different functions. Decision-making occurs through consensus algorithms.', 
   'Self-replication through automated factories. New units programmed with ancestral knowledge and individual variations.', 
   'Highly advanced technological civilization with focus on efficiency and preservation. Cities built underground to avoid harsh surface conditions.', 
   'Controlled growth of exactly 0.5% annually, regulated by central processing units based on resource availability.'),

(6, 'Luminari', 
   'Energy beings with minimal physical form. Appear as glowing orbs of light that can temporarily manifest more complex shapes.', 
   '5000+ Earth years', 
   'Gas giant with dense atmosphere layers. No solid surface, but floating islands of condensed elements serve as habitation.', 
   'Absorb electromagnetic radiation and convert atmospheric gases into energy.', 
   'Collective consciousness with individual nodes. No formal leadership but rather consensus-based decision making.', 
   'Energy division where individuals split into new entities after accumulating sufficient energy. Genetic memory passed to offspring.', 
   'Manipulation of energy fields instead of physical technology. Communication through modulated light frequencies and thought transference.', 
   'Exponential growth of 5% annually during periods of high stellar activity, followed by population stabilization during stellar minimums.'),

(7, 'Gravitites', 
   'Dense, short humanoids with rock-like skin and enhanced strength. Average height 1.2m with six-fingered hands and exceptional tactile sensitivity.', 
   '300-350 Earth years', 
   'High-gravity world with extensive cave systems and underground oceans. Surface experiences extreme radiation and meteor impacts.', 
   'Specialized bacteria that break down minerals and metals. Cultivate fungal gardens in cave systems.', 
   'Clan-based society organized around mining guilds and artisan collectives. Leadership based on skill and resource management.', 
   'Gender-fluid with roles determined by age and skill rather than biological differences. Reproduction requires three genetic donors.', 
   'Master metallurgists and engineers. Cities carved into massive caverns with advanced geothermal energy systems.', 
   'Steady growth of 0.8% annually with accelerated periods during cave system expansions. Population has increased 10-fold over 2000 years.'),

(8, 'Nebulites', 
   'Gaseous beings with swirling, cloud-like bodies containing denser neural clusters. Can condense or expand based on environmental conditions.', 
   '70-90 Earth years', 
   'Low-density planet with thick atmosphere and constant storm systems. No solid surface but floating islands of condensed elements.', 
   'Atmospheric particles and electrical discharges from storm systems. Specialized gas exchange through diffusion.', 
   'Migratory swarms that follow weather patterns. Temporary leadership based on navigation skills and weather prediction.', 
   'Molecular exchange between compatible individuals, producing smaller gaseous offspring that mature by accumulating specific elements.', 
   'Biological technology based on manipulating weather patterns and atmospheric conditions. Communication through pressure waves and electrical signals.', 
   'Highly variable growth ranging from -2% to +7% annually depending on atmospheric conditions and storm frequency.'),

(9, 'Chronos', 
   'Temporal beings experiencing multiple time streams simultaneously. Physical form appears humanoid but with shifting, blurred edges.', 
   'Indefinite/Non-linear perception of time', 
   'Planet with unique temporal anomalies and gravitational distortions. Multiple realities overlap in specific locations.', 
   'Consume temporal energy from gravitational distortions and quantum fluctuations.', 
   'Exist simultaneously as individuals and collective. Social structure incomprehensible to linear time beings.', 
   'Temporal splitting where future versions separate and become new individuals. Past and future selves may coexist.', 
   'Technology based on manipulating time fields and probability. Architecture exists across multiple temporal states simultaneously.', 
   'Non-linear growth pattern that appears random to linear observers but follows complex temporal algorithms. Population exists across multiple timestreams simultaneously.'),

(10, 'Symbionts', 
   'Collective organisms consisting of thousands of smaller entities that form a humanoid shape. Can reconfigure or separate as needed.', 
   '40-50 Earth years for individual components, collective potentially immortal through replacement', 
   'Swamp world with high humidity and biodiversity. Frequent floods and seasonal changes create constantly evolving ecosystems.', 
   'Varied diet based on current configuration. Different components may specialize in different food sources from photosynthesis to predation.', 
   'Perfect democracy where each component has input. Decisions made through chemical consensus with specialized coordinator components.', 
   'Individual components reproduce asexually. New collectives form when sufficient compatible components choose to join together.', 
   'Biological technology using specialized components for specific functions. Architecture designed to accommodate both individual and collective needs.', 
   'Stepped growth pattern with rapid 10% annual increases during favorable conditions followed by plateaus during adaptation periods.');
